package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationPolitics;
import test.domain.InformationPoliticsExample;

public interface InformationPoliticsMapper {
    long countByExample(InformationPoliticsExample example);

    int deleteByExample(InformationPoliticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationPolitics record);

    int insertSelective(InformationPolitics record);

    List<InformationPolitics> selectByExample(InformationPoliticsExample example);

    InformationPolitics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationPolitics record, @Param("example") InformationPoliticsExample example);

    int updateByExample(@Param("record") InformationPolitics record, @Param("example") InformationPoliticsExample example);

    int updateByPrimaryKeySelective(InformationPolitics record);

    int updateByPrimaryKey(InformationPolitics record);
}