package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Studentlogin;
import test.domain.StudentloginExample;

public interface StudentloginMapper {
    long countByExample(StudentloginExample example);

    int deleteByExample(StudentloginExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Studentlogin record);

    int insertSelective(Studentlogin record);

    List<Studentlogin> selectByExample(StudentloginExample example);

    Studentlogin selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByExample(@Param("record") Studentlogin record, @Param("example") StudentloginExample example);

    int updateByPrimaryKeySelective(Studentlogin record);

    int updateByPrimaryKey(Studentlogin record);
}