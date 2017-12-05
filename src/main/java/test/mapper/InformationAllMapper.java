package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationAll;
import test.domain.InformationAllExample;

public interface InformationAllMapper {
    long countByExample(InformationAllExample example);

    int deleteByExample(InformationAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationAll record);

    int insertSelective(InformationAll record);

    List<InformationAll> selectByExample(InformationAllExample example);

    InformationAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationAll record, @Param("example") InformationAllExample example);

    int updateByExample(@Param("record") InformationAll record, @Param("example") InformationAllExample example);

    int updateByPrimaryKeySelective(InformationAll record);

    int updateByPrimaryKey(InformationAll record);
}