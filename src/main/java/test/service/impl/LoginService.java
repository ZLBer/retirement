package test.service.impl;

import org.springframework.stereotype.Service;
import test.domain.*;
import test.mapper.AdminuserMapper;
import test.mapper.CollegeuserMapper;
import test.mapper.StudentloginMapper;
import test.mapper.TeacherloginMapper;
import test.service.ILoginService;

import javax.annotation.Resource;
import java.util.List;

@Service("loginService")
public class LoginService implements ILoginService {

    @Resource
    StudentloginMapper studentloginMapper;
    @Resource
    CollegeuserMapper collegeuserMapper;
    @Resource
    TeacherloginMapper teacherloginMapper;
    @Resource
    AdminuserMapper adminuserMapper;

    @Override
    public Studentlogin verifySUserIdentity(String username,String password) {
        Studentlogin entity = studentloginMapper.selectByPrimaryKey(Integer.valueOf(username));
        if (entity!=null&&entity.getStudentPassword().equals(password)){
            return entity;
        }
        return null;
    }

    @Override
    public Collegeuser verifyCUserIdentity(String username,String password) {
        CollegeuserExample example = new CollegeuserExample();
        CollegeuserExample.Criteria criteria = example.createCriteria();
        criteria.andCollegeNameEqualTo(username);
        List<Collegeuser> list =  collegeuserMapper.selectByExample(example);
        if (list!=null&&list.size()!=0) {
            Collegeuser entity = list.get(0);
            if (entity != null && entity.getCollegePassword().equals(password)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public Teacherlogin verifyTUserIdentity(String username,String password) {
        TeacherloginExample example = new TeacherloginExample();
        TeacherloginExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherLoginEqualTo(username);
        List<Teacherlogin> list = teacherloginMapper.selectByExample(example);
        if (list!=null&&list.size()!=0) {
            Teacherlogin entity = list.get(0);
            if (entity != null && entity.getTeacherPassword().equals(password)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public Adminuser verifyAUserIdentity(String username,String password) {
        Adminuser entity = adminuserMapper.selectByPrimaryKey(username);
        if (entity!=null&&entity.getAdminPassword().equals(password)){
            return entity;
        }
        return null;
    }
}
