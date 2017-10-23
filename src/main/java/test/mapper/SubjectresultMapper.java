package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Subjectresult;
import test.domain.SubjectresultExample;

public interface SubjectresultMapper {
    long countByExample(SubjectresultExample example);

    int deleteByExample(SubjectresultExample example);

    int deleteByPrimaryKey(Integer resultId);

    int insert(Subjectresult record);

    int insertSelective(Subjectresult record);

    List<Subjectresult> selectByExample(SubjectresultExample example);

    Subjectresult selectByPrimaryKey(Integer resultId);

    int updateByExampleSelective(@Param("record") Subjectresult record, @Param("example") SubjectresultExample example);

    int updateByExample(@Param("record") Subjectresult record, @Param("example") SubjectresultExample example);

    int updateByPrimaryKeySelective(Subjectresult record);

    int updateByPrimaryKey(Subjectresult record);
}