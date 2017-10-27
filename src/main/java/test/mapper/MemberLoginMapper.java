package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.MemberLogin;
import test.domain.MemberLoginExample;

public interface MemberLoginMapper {
    long countByExample(MemberLoginExample example);

    int deleteByExample(MemberLoginExample example);

    int deleteByPrimaryKey(String memberName);

    int insert(MemberLogin record);

    int insertSelective(MemberLogin record);

    List<MemberLogin> selectByExample(MemberLoginExample example);

    MemberLogin selectByPrimaryKey(String memberName);

    int updateByExampleSelective(@Param("record") MemberLogin record, @Param("example") MemberLoginExample example);

    int updateByExample(@Param("record") MemberLogin record, @Param("example") MemberLoginExample example);

    int updateByPrimaryKeySelective(MemberLogin record);

    int updateByPrimaryKey(MemberLogin record);
}