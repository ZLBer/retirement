package test.service.impl;

import org.springframework.stereotype.Service;
import test.domain.Subject;
import test.domain.SubjectExample;
import test.domain.Teacher;
import test.domain.Teacherlogin;
import test.mapper.SubjectMapper;
import test.mapper.TeacherMapper;
import test.service.ITeacherService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by libin on 2017/9/25.
 */
@Service("teacherService")
public class TeacherService implements ITeacherService {


    @Resource
    TeacherMapper teacherMapper;
    @Resource
    SubjectMapper subjectMapper;


    @Override
    public Teacher getTeacher(int teacherid) {
        return teacherMapper.selectByPrimaryKey(teacherid);
    }
    @Override
    public Subject getSubjectByTeacherId(int teacherid) {
        SubjectExample example=new SubjectExample();
        SubjectExample.Criteria criteria=example.createCriteria();
        criteria.andSubjectTeacherEqualTo(teacherid);
        List<Subject> subjects= subjectMapper.selectByExample(example);
        if(subjects.size()>0)
        return   subjects.get(0);
        else  return new Subject();
    }

    @Override
    public boolean saveSubject(Subject subject) {
        if(subjectMapper.insertSelective(subject)>0)
            return true;
        else
        return false;
    }

    @Override
    public boolean saveOrUpdateSubject(Teacherlogin teacherlogin, String subjectName, int subjectNumber, String other) {
        Teacher teacher=getTeacher(teacherlogin.getId());
        Subject subject=new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectNumber(subjectNumber);
        subject.setSubjectTeacher(teacherlogin.getId());
        subject.setOther(other);
        subject.setSubjectDepartment(teacher.getTeacherDepartment());
        SubjectExample example=new SubjectExample();
        SubjectExample.Criteria criteria=example.createCriteria();
        criteria.andSubjectTeacherEqualTo(teacherlogin.getId());
        List<Subject> subjects= subjectMapper.selectByExample(example);
        if(subjects.size()>0) {
            subject.setSubjectId(subjects.get(0).getSubjectId());
            if(subjectMapper.updateByPrimaryKeySelective(subject)>0)
                return true;
            else  return false;
        }
        else if(subjectMapper.insertSelective(subject)>0) return true;
        else  return false;
    }
}
