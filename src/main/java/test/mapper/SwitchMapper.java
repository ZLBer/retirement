package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Switch;
import test.domain.SwitchExample;

public interface SwitchMapper {
    long countByExample(SwitchExample example);

    int deleteByExample(SwitchExample example);

    int deleteByPrimaryKey(Integer college);

    int insert(Switch record);

    int insertSelective(Switch record);

    List<Switch> selectByExample(SwitchExample example);

    Switch selectByPrimaryKey(Integer college);

    int updateByExampleSelective(@Param("record") Switch record, @Param("example") SwitchExample example);

    int updateByExample(@Param("record") Switch record, @Param("example") SwitchExample example);

    int updateByPrimaryKeySelective(Switch record);

    int updateByPrimaryKey(Switch record);
}