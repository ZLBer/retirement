package test.service.impl;

import org.springframework.stereotype.Service;
import test.domain.*;
import test.mapper.MajorMapper;
import test.mapper.StudentMapper;
import test.mapper.SubjectMapper;
import test.mapper.TeacherMapper;
import test.service.IStudentService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by libin on 2017/9/24.
 */
@Service("studentService")
public class StudentService implements IStudentService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    TeacherMapper teacherMapper;
    @Resource
    SubjectMapper subjectMapper;
    @Resource
    MajorMapper majorMapper;

    @Override
    public Student savePersonalInfo(Student student,String phone, String qq, String email) {
        student.setStudentTel(phone);
        student.setStudentQq(qq);
        student.setStudentEmail(email);
        studentMapper.updateByPrimaryKey(student);
        return student;
    }

    @Override
    public Student getStudent(int studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public Map<Integer, List<Subject>> getMyDepartmentTeachersAndSubject(int major) {
        int departmentId = majorMapper.getDepartmentId(major);
        List<Integer> teachers = teacherMapper.getTeachersIdByDepart(departmentId);
        Map<Integer,List<Subject>> map = new HashMap<Integer, List<Subject>>();
        for (Integer teacherId:teachers){
            List<Subject> subjects = subjectMapper.getSubjectByTeacher(teacherId);
            map.put(teacherId,subjects);
        }
        return map;
    }

    @Override
    public List<Teacher> getTeachers(int majorId) {
        int departmentId = majorMapper.getDepartmentId(majorId);
        return teacherMapper.getTeachersByDepart(departmentId);
    }

    @Override
    public List<Subjectresult> getResult(int studentId) {
        return null;
    }


}
