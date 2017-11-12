package test.controller;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import test.domain.*;
import test.service.IAdminService;
import test.service.impl.AdminService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static test.service.impl.ExcelUtil.read2007Excel;
import static test.service.impl.ExcelUtil.writeXlsx;

/**
 * Created by libin on 2017/10/27.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    static double percent=0;
    @Resource
    IAdminService adminService;
    @Resource
    StandardServletMultipartResolver multipartResolver;

    @RequestMapping(path = "/goDownload")
    public String goDownload(Model model) {
        model.addAttribute("bodyRightContent", "admin/download");
        return "main";
    }


    @RequestMapping(path = "/downloadExcel")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        String[] informationBasic = request.getParameterValues("informationBasic");
        String[] informationPolitics = request.getParameterValues("informationPolitics");
        String[] informationOriginal = request.getParameterValues("informationOriginal");
        String[] informationPresent = request.getParameterValues("informationPresent");
        String[] informationContact = request.getParameterValues("informationContact");
        String[] informationSupplement = request.getParameterValues("informationSupplement");
        List<String> titles = adminService.getCTitles(informationBasic, informationPolitics, informationOriginal, informationPresent, informationContact, informationSupplement);

        writeXlsx("D://123.xlsx", titles);
        File file = new File("D://123.xlsx");
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }


    @RequestMapping(path = "/goUpload")
    public String gotoUpload(Model model) {
        model.addAttribute("bodyRightContent", "admin/upload");
        return "main";
    }

    @RequestMapping(path = "/uploadExcel")
    @ResponseBody
    public Result upload(@RequestParam MultipartFile[] myfiles, HttpServletRequest request) throws IOException {
        Result result = new Result(1, "修改密码", "密码修改成功");
        String[] informationBasic = request.getParameterValues("informationBasic");
        String[] informationPolitics = request.getParameterValues("informationPolitics");
        String[] informationOriginal = request.getParameterValues("informationOriginal");
        String[] informationPresent = request.getParameterValues("informationPresent");
        String[] informationContact = request.getParameterValues("informationContact");
        String[] informationSupplement = request.getParameterValues("informationSupplement");
        double columen=0;
        percent=0;
        String IType = request.getParameter("IType");
        for (MultipartFile myfile : myfiles) {
            if (myfile.isEmpty()) {
                System.out.println("文件未上传");
            } else {
                System.out.println("文件长度: " + myfile.getSize());
                System.out.println("文件类型: " + myfile.getContentType());
                System.out.println("文件名称: " + myfile.getName());
                System.out.println("文件原名: " + myfile.getOriginalFilename());
                System.out.println("========================================");
                File file = new File("D://123.xlsx");
                FileUtils.copyInputStreamToFile(myfile.getInputStream(), file);
                List<List<Object>> m = read2007Excel(file);
                List<List<String>> s = adminService.getETitles(informationBasic, informationPolitics, informationOriginal, informationPresent, informationContact, informationSupplement);
                if (IType.equals("1")) {
                    for (List mm : m) {
                        adminService.addSave(s, mm);
                        columen+=1;
                        percent=columen/m.size()*100;
                    }
                } else if (IType.equals("2")) {
                    for (List mm : m) {
                        adminService.insertOrUpdateSave(s, mm);
                        columen+=1;
                        percent=columen/m.size()*100;
                    }
                } else {
                    for (List mm : m) {
                        adminService.coverSave(s, mm);
                        columen+=1;
                        percent=columen/m.size()*100;
                    }
                }


            }
        }
        return result;
    }
    @RequestMapping(path = "/percent")
    @ResponseBody
    public Result precent() throws IOException {

        Result result = new Result(1, "", (int)percent+"%");
        return  result;
    }
    @RequestMapping(path = "/goPersonInfo")
    public String goAdd(Model model){
        model.addAttribute("bodyRightContent", "admin/personInfo");
        return "main";
    }
    @ResponseBody
    @RequestMapping(path = "/addPerson")
    public Result addPerson(@RequestBody InformationAll informationAll){
        System.out.println(informationAll.getName());
        System.out.println(informationAll.getEmail());
        String r=adminService.saveByall(informationAll);
        Result result = new Result(1, "", r);
        return  result;
    }
    @RequestMapping(path = "/goModifyPersonInfo")
    public String gomodify(Model model){
        model.addAttribute("bodyRightContent", "admin/modifyPersonInfo");
        return "main";
    }
}
