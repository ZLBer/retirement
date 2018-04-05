package test.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.GlobleVariance;
import test.domain.*;
import test.mapper.InformationAllMapper;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
    String detail(Model model, HttpServletRequest request){
        String json = request.getParameter("rowData");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String classPath = ResourceUtils.getURL("classpath:").toString();
            InformationAll all = mapper.readValue(json,InformationAll.class);
            model.addAttribute("all",all);
            model.addAttribute("classPath",classPath.substring(6,classPath.length())+"static/photos/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "student/detail";
    }

    @GetMapping("/student/download/{id}")
    String download(Model model, HttpServletResponse response, HttpServletRequest request, @PathVariable Integer id){
        InformationAll all = informationAllMapper.selectByPrimaryKey(id);
        model.addAttribute("all",all);
        response.setHeader("content-Type", "application/msword");
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+java.net.URLEncoder.encode(all.getName(),"utf-8")+".doc");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "student/info.xml";
    }

}
