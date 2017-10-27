package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.GlobleVariance;
import test.domain.Result;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {
/*    @Resource
    StudentMapper studentMapper;

    @ResponseBody
    @PostMapping("/student/dotest")
    List<Student> test(HttpServletRequest request) {
        StudentExample example = (StudentExample) request.getAttribute("example");
        List<Student> list = studentMapper.selectByExample(example);
        return list;
//        return new Result(1,"测试","查到"+list.size()+"条结果");
    }*/

    @GetMapping("/student/test")
    String goTest(Model model){
        model.addAttribute(GlobleVariance.BodyRightContent,"student/test");
        return "main";
    }


}
