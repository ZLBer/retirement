package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Professional;
import test.domain.ProfessionalExample;

public interface ProfessionalMapper {
    long countByExample(ProfessionalExample example);

    int deleteByExample(ProfessionalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Professional record);

    int insertSelective(Professional record);

    List<Professional> selectByExample(ProfessionalExample example);

    Professional selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByExample(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByPrimaryKeySelective(Professional record);

    int updateByPrimaryKey(Professional record);
}