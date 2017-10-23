package test.service;

import test.domain.Subject;
import test.domain.Teacher;
import test.domain.Teacherlogin;

import java.util.List;

/**
 * Created by libin on 2017/9/25.
 */
public interface ITeacherService {
    Teacher getTeacher(int teacherid);
    Subject getSubjectByTeacherId(int teacherid);
    boolean saveSubject(Subject subject);
    boolean  saveOrUpdateSubject(Teacherlogin teacherlogin, String subjectName, int subjectNumber, String other);

}
