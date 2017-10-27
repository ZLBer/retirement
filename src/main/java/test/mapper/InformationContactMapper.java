package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.InformationContact;
import test.domain.InformationContactExample;

public interface InformationContactMapper {
    long countByExample(InformationContactExample example);

    int deleteByExample(InformationContactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationContact record);

    int insertSelective(InformationContact record);

    List<InformationContact> selectByExample(InformationContactExample example);

    InformationContact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationContact record, @Param("example") InformationContactExample example);

    int updateByExample(@Param("record") InformationContact record, @Param("example") InformationContactExample example);

    int updateByPrimaryKeySelective(InformationContact record);

    int updateByPrimaryKey(InformationContact record);
}