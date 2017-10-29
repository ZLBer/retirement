package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.GlobleVariance;
import test.domain.*;
import test.mapper.InformationAllMapper;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {
    @Resource
    InformationAllMapper informationAllMapper;

    @ResponseBody
    @GetMapping("/student/dotest")
    List<InformationAll> test(HttpServletRequest request) {
        InformationAllExample example = (InformationAllExample) request.getAttribute("example");
        List<InformationAll> list = informationAllMapper.selectByExample(example);
        return list;
//        return new Result(1,"测试","查到"+list.size()+"条结果");
    }


    @GetMapping("/student/test")
    String goTest(Model model){
        model.addAttribute(GlobleVariance.BodyRightContent,"student/test");
        return "main";
    }

    @PostMapping("/student/detail")
    String detail(Model model){
        return "student/detail";
    }

}
