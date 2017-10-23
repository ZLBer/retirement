package test.service.impl;

import org.springframework.stereotype.Service;
import test.domain.Adminuser;
import test.domain.Collegeuser;
import test.domain.Studentlogin;
import test.domain.Teacherlogin;
import test.mapper.AdminuserMapper;
import test.mapper.CollegeuserMapper;
import test.mapper.StudentloginMapper;
import test.mapper.TeacherloginMapper;
import test.service.IModifyPwdService;

import javax.annotation.Resource;

/**
 * Created by libin on 2017/9/24.
 */
@Service("modifyPwdService")
public class ModifyPwdService implements IModifyPwdService {

    @Resource
    StudentloginMapper studentloginMapper;
    @Resource
    CollegeuserMapper collegeuserMapper;
    @Resource
    TeacherloginMapper teacherloginMapper;
    @Resource
    AdminuserMapper adminuserMapper;

    @Override
   public int  modifyStudentPwd(Object user, String password){
       Studentlogin studentlogin=(Studentlogin)user;
        studentlogin.setStudentPassword(password);
         return studentloginMapper.updateByPrimaryKey(studentlogin);
    }
    @Override
    public int modifyCollegePwd(Object user, String password){
   Collegeuser  collegeuser=(Collegeuser)user;
     collegeuser.setCollegePassword(password);
     return collegeuserMapper.updateByPrimaryKey(collegeuser);


    }
    @Override
    public int modifyTeacherPwd(Object user, String password){

      Teacherlogin  teacherlogin=(Teacherlogin)user;
        teacherlogin.setTeacherPassword(password);
        return  teacherloginMapper.updateByPrimaryKey(teacherlogin);
    }
    public  int modifyAdminPwd(Object user, String password){
      Adminuser  adminuser=(Adminuser)user;
        adminuser.setAdminPassword(password);
        return adminuserMapper.updateByPrimaryKey(adminuser);

    }
}
