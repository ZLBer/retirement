package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationOriginal;
import test.domain.InformationOriginalExample;

public interface InformationOriginalMapper {
    long countByExample(InformationOriginalExample example);

    int deleteByExample(InformationOriginalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationOriginal record);

    int insertSelective(InformationOriginal record);

    List<InformationOriginal> selectByExample(InformationOriginalExample example);

    InformationOriginal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationOriginal record, @Param("example") InformationOriginalExample example);

    int updateByExample(@Param("record") InformationOriginal record, @Param("example") InformationOriginalExample example);

    int updateByPrimaryKeySelective(InformationOriginal record);

    int updateByPrimaryKey(InformationOriginal record);
}