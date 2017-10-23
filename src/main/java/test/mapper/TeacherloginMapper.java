package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Teacherlogin;
import test.domain.TeacherloginExample;

public interface TeacherloginMapper {
    long countByExample(TeacherloginExample example);

    int deleteByExample(TeacherloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacherlogin record);

    int insertSelective(Teacherlogin record);

    List<Teacherlogin> selectByExample(TeacherloginExample example);

    Teacherlogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacherlogin record, @Param("example") TeacherloginExample example);

    int updateByExample(@Param("record") Teacherlogin record, @Param("example") TeacherloginExample example);

    int updateByPrimaryKeySelective(Teacherlogin record);

    int updateByPrimaryKey(Teacherlogin record);
}