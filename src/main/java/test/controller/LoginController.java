package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import test.GlobleVariance;
import test.domain.AdminLogin;
import test.service.ILoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static test.GlobleVariance.USER_ADMIN;
import static test.GlobleVariance.USER_MEMBER;

@Controller
@SessionAttributes({"user", "templateDir"})
public class LoginController {

    String types;
    @Resource
    ILoginService loginService;
    private String templateDir;
    private final String ZONGHE = "zonghe";
    private final String TUIXIU = "tuixiu";
    private final String LIXIU= "lixiu";
    private final String JIASHU = "jiashu";

    @RequestMapping("/login")
    public String login(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "main";
        }
        return "login";
    }

    @GetMapping("/main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/validate")
    public String verifyUser(HttpServletRequest servletRequest, Model model, HttpSession session) {
        Object user;
        try {
            if (session.getAttribute("user") != null) {
//                model.addAttribute("user", session.getAttribute("user"));
//                model.addAttribute("templateDir",session.getAttribute("templateDir"));
                return "main";
            } else if ((user = processingValidation(servletRequest)) != null) {
                model.addAttribute("user", user);
                checkType(session,user);
                System.out.println(((String[] )session.getAttribute("types"))[0]);
                model.addAttribute("templateDir", templateDir);
                model.addAttribute(GlobleVariance.BodyRightContent, "student/default");
                return "main";
            } else {
                model.addAttribute("errMsg", "用户名和密码错误");
                return "login";
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errMsg", "未知错误");
            return "login";
        }
    }

    private Object processingValidation(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int type = Integer.parseInt(request.getParameter("type"));
        switch (type) {
            case USER_MEMBER:
                templateDir = "member";
                return loginService.verifyMUserIdentity(username, password);
            case USER_ADMIN:
                templateDir = "admin";
                return loginService.verifyAUserIdentity(username, password);
            default:
                return null;
        }
    }
    private void checkType(HttpSession session,Object user){
        if(user.getClass().equals(AdminLogin.class)){
         String  type= ((AdminLogin) user).getAdminName();
       if(ZONGHE.equals(type)){
             String []types=new String[3];
             types[0]="退休";
           types[1]="离休";
           types[2]="家属";
           session.setAttribute("types",types);
           session.setAttribute("type",0);
       }else if(TUIXIU.equals(type)){
           String []types=new String[1];
           types[0]="退休";
           session.setAttribute("types",types);
           session.setAttribute("type",2);
      }else if(LIXIU.equals(type)){
           String []types=new String[1];
           types[0]="离休";
           session.setAttribute("types",types);
           session.setAttribute("type",3);
       }else {
           String []types=new String[1];
           types[0]="家属";
           session.setAttribute("types",types);
           session.setAttribute("type",4);
       }
        } else {
            String []types=new String[3];
            types[0]="退休";
            types[1]="离休";
            types[2]="家属";
            session.setAttribute("types",types);
            session.setAttribute("type",1);
        }

    }
}
