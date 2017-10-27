package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationSupplement;
import test.domain.InformationSupplementExample;

public interface InformationSupplementMapper {
    long countByExample(InformationSupplementExample example);

    int deleteByExample(InformationSupplementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationSupplement record);

    int insertSelective(InformationSupplement record);

    List<InformationSupplement> selectByExample(InformationSupplementExample example);

    InformationSupplement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationSupplement record, @Param("example") InformationSupplementExample example);

    int updateByExample(@Param("record") InformationSupplement record, @Param("example") InformationSupplementExample example);

    int updateByPrimaryKeySelective(InformationSupplement record);

    int updateByPrimaryKey(InformationSupplement record);
}