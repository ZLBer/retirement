package test.controller;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import test.domain.*;
import test.mapper.AdminLoginMapper;
import test.mapper.InformationPresentMapper;
import test.service.IAdminService;
import test.service.impl.AdminService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.regex.Pattern;

import static test.service.impl.ExcelUtil.read2007Excel;
import static test.service.impl.ExcelUtil.writeXlsx;

/**
 * Created by libin on 2017/10/27.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
//    static double percent=0;
    @Resource
    IAdminService adminService;
    @Resource
    StandardServletMultipartResolver multipartResolver;
    @Resource
    InformationPresentMapper informationPresentMapper;

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
//        double columen=0;
//        percent=0;
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
//                        columen+=1;
//                        percent=columen/m.size()*100;
                    }
                    informationPresentMapper.updateAlld();
                } else if (IType.equals("2")) {
                    for (List mm : m) {
                        adminService.insertOrUpdateSave(s, mm);
//                        columen+=1;
//                        percent=columen/m.size()*100;
                    }
                    informationPresentMapper.updateAlld();
                } else {
                    for (List mm : m) {
                        adminService.coverSave(s, mm);
//                        columen+=1;
//                        percent=columen/m.size()*100;
                    }
                    informationPresentMapper.updateAlld();
                }


            }
        }
        return result;
    }
//    @RequestMapping(path = "/percent")
//    @ResponseBody
//    public Result precent() throws IOException {
//
//        Result result = new Result(1, "", (int)percent+"%");
//        return  result;
//    }
    @RequestMapping(path = "/goPersonInfo")
    public String goAdd(Model model){
        model.addAttribute("bodyRightContent", "admin/personInfo");
        return "main";
    }
    @ResponseBody
    @RequestMapping(path = "/addPerson")
    public Result addPerson(@RequestBody InformationAll informationAll){
        String r=adminService.saveByall(informationAll);
        Result result = new Result(1, "", r);
        return  result;
    }
    @RequestMapping(path = "/goModifyPersonInfo")
    public String gomodify(Model model){
        model.addAttribute("bodyRightContent", "admin/modifyPersonInfo");
        return "main";
    }

    @RequestMapping(path = "/updatePerson")
    @ResponseBody
    public Result update(@RequestBody InformationAll informationAll){
        System.out.println(informationAll.getDegree());
        System.out.println(informationAll.getEducationLevel());
        String r=adminService.updateByall(informationAll);
        informationPresentMapper.updateAlld();
        Result result = new Result(1, "", r);
        return  result;
    }
    @RequestMapping(path = "/deletePerson")
    @ResponseBody
    public Result delete(HttpServletRequest request){
        String id=request.getParameter("id");
        String r=adminService.deleteById(Integer.parseInt(id));
        Result result = new Result(1, "", r);
        return  result;
    }
    @RequestMapping(path = "/deletePersons")
    @ResponseBody
    public Result deletePersons(HttpServletRequest request) throws IOException {
        String ids=request.getParameter("ids");
       String[]idsint= ids.split(",");
       for(String id:idsint){
           adminService.deleteById(Integer.parseInt(id));
       }
        return new Result(1,"","删除成功！");
    }

    @GetMapping("/goUploadPhoto")
    public  String  goUploadPhoto(Model model){
        model.addAttribute("bodyRightContent", "admin/uploadPhoto");
        return "main";
    }
@ResponseBody
    @RequestMapping("/uploadPhoto")
    public  Result uploadPhoto(MultipartFile file) throws Exception{
 // 获取项目根目录
    File path = new File(ResourceUtils.getURL("classpath:").getPath());
    if(!path.exists()) path = new File("");
    System.out.println("path:"+path.getAbsolutePath());
//如果上传目录为/static/photos/，则可以如下获取：
    File upload = new File(path.getAbsolutePath(),"static/photos");
    if(!upload.exists()) upload.mkdirs();
    System.out.println("upload url:"+upload.getAbsolutePath());

        if (file.isEmpty()) {
            System.out.println("文件未上传");
            return new Result(0,"","上传失败");
        } else {
            System.out.println("文件长度: " + file.getSize());
            System.out.println("文件类型: " + file.getContentType());
            System.out.println("文件名称: " + file.getName());
            System.out.println("文件原名: " + file.getOriginalFilename());
            System.out.println("========================================");
        }
        //判断命名格式
    String[] fileName = file.getOriginalFilename().split("\\\\");
    String[] fileNames=fileName[fileName.length-1].split("\\.");
    if(!isIDCard(fileNames[0]))
    return new Result(0,"","命名不规范，请用身份证号命名");
    //file.transferTo(new File("  D:\\cf"+"\\"+file.getOriginalFilename()));
        file.transferTo(new File(String.valueOf(upload)+"\\"+fileName[fileName.length-1]));
        return new Result(1,"","上传成功");

    }
    public boolean isIDCard(String idCard) {
        String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }
    @RequestMapping(path = "/goInitPWD")
    public String goInitPWD(Model model) {
        model.addAttribute("bodyRightContent", "admin/initPWD");
    List<AdminLogin> adminLogins=  adminService.getAdminUser();
    List<MemberLogin> memberLogins= adminService.getMemberUser();
    model.addAttribute("admins",adminLogins);
    model.addAttribute("members",memberLogins);
        return "main";
    }
    @RequestMapping(path = "/initPWD")
    @ResponseBody
    public Result initPWD(Model model, @Param("name")String name) {
        System.out.println(name);
        adminService.initPWD(name,"123");
        return new  Result(1, "", "重置成功");
    }
}
