package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.AdminLogin;
import test.domain.AdminLoginExample;

public interface AdminLoginMapper {
    long countByExample(AdminLoginExample example);

    int deleteByExample(AdminLoginExample example);

    int deleteByPrimaryKey(String adminName);

    int insert(AdminLogin record);

    int insertSelective(AdminLogin record);

    List<AdminLogin> selectByExample(AdminLoginExample example);

    AdminLogin selectByPrimaryKey(String adminName);

    int updateByExampleSelective(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByExample(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByPrimaryKeySelective(AdminLogin record);

    int updateByPrimaryKey(AdminLogin record);
}