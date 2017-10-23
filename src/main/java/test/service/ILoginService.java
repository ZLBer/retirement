package test.service;

import test.domain.*;

public interface ILoginService {
    Studentlogin verifySUserIdentity(String username,String password);
    Collegeuser verifyCUserIdentity(String username,String password);
    Teacherlogin verifyTUserIdentity(String username,String password);
    Adminuser verifyAUserIdentity(String username,String password);
}
