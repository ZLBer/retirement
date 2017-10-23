package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import test.service.ILoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"user","templateDir"})
public class LoginController {
    public static final int USER_STUDENT = 1;
    public static final int USER_TEACHER = 2;
    public static final int USER_COLLEGE = 3;
    public static final int USER_ADMIN = 4;

    private String templateDir;

    @Resource
    ILoginService loginService;

    @RequestMapping("/login")
    public String login(HttpSession session){
        if (session.getAttribute("user")!=null){
            return "main";
        }
        return "login";
    }

    @GetMapping("/main")
    public String toMain(){
        return "main";
    }
    @RequestMapping("/validate")
    public String verifyUser(HttpServletRequest servletRequest, Model model, HttpSession session){
        Object user;
        try {
            if (session.getAttribute("user")!=null){
//                model.addAttribute("user", session.getAttribute("user"));
//                model.addAttribute("templateDir",session.getAttribute("templateDir"));
                return "main";
            }else if ((user = processingValidation(servletRequest))!=null) {
                model.addAttribute("user", user);
                model.addAttribute("templateDir",templateDir);
                return "main";
            } else {
                model.addAttribute("errMsg", "用户名和密码错误");
                return "login";
            }
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("errMsg", "未知错误");
            return "login";
        }
    }
    private Object processingValidation(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int type = Integer.parseInt(request.getParameter("type"));
        switch (type){
            case USER_STUDENT:
                templateDir = "student";
                return loginService.verifySUserIdentity(username,password);
            case USER_TEACHER:
                templateDir = "teacher";
                return loginService.verifyTUserIdentity(username,password);
            case USER_COLLEGE:
                templateDir = "college";
                return  loginService.verifyCUserIdentity(username,password);
            case USER_ADMIN:
                templateDir = "admin";
                return loginService.verifyAUserIdentity(username,password);
            default:
                return null;
        }
    }
}
