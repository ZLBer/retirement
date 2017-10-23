package test.controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.domain.Result;
import test.domain.Subject;
import test.domain.Teacher;
import test.domain.Teacherlogin;
import test.service.ITeacherService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by libin on 2017/9/25.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    ITeacherService teacherService;

    @RequestMapping("/toAddSubject")
    public String toAddSubjectHtml(Model model, HttpSession session) {
        Teacherlogin teacher = (Teacherlogin) session.getAttribute("user");
       Subject subject= teacherService.getSubjectByTeacherId(teacher.getId());
        model.addAttribute("subject",subject);
        model.addAttribute("bodyRightContent", "teacher/addSubject");
        return "main";
    }
    @ResponseBody
    @RequestMapping("/saveSubject")
    public Result saveSubject(HttpSession session,String subjectName,int subjectNumber,String other){
        Teacherlogin teacherlogin = (Teacherlogin) session.getAttribute("user");

           if(teacherService.saveOrUpdateSubject(teacherlogin,subjectName,subjectNumber,other)) {
               return new Result(1,"","添加课题成功！");
           }
         else return new Result(0,"","添加课题失败！");
    }
}
