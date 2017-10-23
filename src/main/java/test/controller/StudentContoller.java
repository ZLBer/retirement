package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.domain.*;
import test.service.IStudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentContoller {
    @Resource
    IStudentService studentService;

    @GetMapping("/personalInfo")
    public String gotoPersonalInfo(HttpSession session, Model model){
        try {
            int userId = ((Studentlogin) session.getAttribute("user")).getStudentId();
            Student student;
            if (session.getAttribute("userInfo") == null) {
                student = studentService.getStudent(userId);
                if (student == null) {
                    throw new RuntimeException("无该用户信息");
                }
                session.setAttribute("userInfo", student);
            } else {
                student = (Student) session.getAttribute("userInfo");
            }
            model.addAttribute("userInfo", student);
            model.addAttribute("bodyRightContent", "student/personalInfo");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "main";
    }

    @ResponseBody
    @PostMapping("/perfectPersonalInfo")
    public Result perfectPersonalInfo(HttpServletRequest request, HttpSession session){
        Result result = new Result(1,"完善个人信息","完善个人信息成功");
        try {
            String phone = request.getParameter("phoneNum");
            String qq = request.getParameter("qqNum");
            String email = request.getParameter("email");
            Student student = studentService.savePersonalInfo((Student) session.getAttribute("userInfo"), phone, qq, email);
            session.setAttribute("userInfo", student);
        }catch (Exception e){
            result.setState(0);
            result.setMsg("发生未知错误");
            e.printStackTrace();
        }finally {
            return result;
        }
    }
    @GetMapping("/selectSubject")
    public String selectSubject(HttpSession session,Model model){
        try {
            int majorId = StudentInfoInSession(session).getStudentMajor();
            Map<Integer,List<Subject>> subjects = studentService.getMyDepartmentTeachersAndSubject(majorId);
            List<Teacher> teachers = studentService.getTeachers(majorId);
            model.addAttribute("subjectsMap",subjects);
            model.addAttribute("teachers",teachers);
            model.addAttribute("bodyRightContent", "student/selectSubject");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "main";
    }

    public Student StudentInfoInSession(HttpSession session){
        Student student;
        if ((student= (Student) session.getAttribute("userInfo")) == null) {
            int userId = ((Studentlogin)session.getAttribute("user")).getStudentId();
            student = studentService.getStudent(userId);
            if (student == null) {
                throw new RuntimeException("无该用户信息");
            }
            session.setAttribute("userInfo", student);
            return student;
        }
        return student;
    }
}
