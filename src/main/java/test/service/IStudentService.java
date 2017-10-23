package test.service;

import test.domain.*;
import java.util.List;
import java.util.Map;

/**
 * Created by libin on 2017/9/24.
 */
public interface IStudentService {
    Student savePersonalInfo(Student student,String phone,String qq,String email);
    Student getStudent(int studentId);
    Map<Integer, List<Subject>> getMyDepartmentTeachersAndSubject(int majorId);
    List<Teacher> getTeachers(int majorId);
    List<Subjectresult> getResult(int studentId);
}
