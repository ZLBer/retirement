package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationBasic;
import test.domain.InformationBasicExample;

public interface InformationBasicMapper {
    long countByExample(InformationBasicExample example);

    int deleteByExample(InformationBasicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationBasic record);

    int insertSelective(InformationBasic record);

    List<InformationBasic> selectByExample(InformationBasicExample example);

    InformationBasic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationBasic record, @Param("example") InformationBasicExample example);

    int updateByExample(@Param("record") InformationBasic record, @Param("example") InformationBasicExample example);

    int updateByPrimaryKeySelective(InformationBasic record);

    int updateByPrimaryKey(InformationBasic record);
}