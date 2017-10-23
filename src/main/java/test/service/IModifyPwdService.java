package test.service;

import test.domain.Adminuser;
import test.domain.Collegeuser;
import test.domain.Studentlogin;
import test.domain.Teacherlogin;

/**
 * Created by libin on 2017/9/24.
 */
public interface IModifyPwdService {
    int  modifyStudentPwd(Object user, String password);
    int  modifyCollegePwd(Object user, String password);
    int  modifyTeacherPwd(Object user, String password);
    int  modifyAdminPwd(Object user, String password);
}
