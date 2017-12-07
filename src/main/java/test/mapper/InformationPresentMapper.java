package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationPresent;
import test.domain.InformationPresentExample;

public interface InformationPresentMapper {
    long countByExample(InformationPresentExample example);

    int deleteByExample(InformationPresentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationPresent record);

    int insertSelective(InformationPresent record);

    List<InformationPresent> selectByExample(InformationPresentExample example);

    InformationPresent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationPresent record, @Param("example") InformationPresentExample example);

    int updateByExample(@Param("record") InformationPresent record, @Param("example") InformationPresentExample example);

    int updateByPrimaryKeySelective(InformationPresent record);

    int updateByPrimaryKey(InformationPresent record);
    void  updateAlld();
}