package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.Collegeuser;
import test.domain.CollegeuserExample;

public interface CollegeuserMapper {
    long countByExample(CollegeuserExample example);

    int deleteByExample(CollegeuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Collegeuser record);

    int insertSelective(Collegeuser record);

    List<Collegeuser> selectByExample(CollegeuserExample example);

    Collegeuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Collegeuser record, @Param("example") CollegeuserExample example);

    int updateByExample(@Param("record") Collegeuser record, @Param("example") CollegeuserExample example);

    int updateByPrimaryKeySelective(Collegeuser record);

    int updateByPrimaryKey(Collegeuser record);
}