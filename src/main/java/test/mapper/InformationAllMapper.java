package test.mapper;

import java.util.List;

import test.domain.InformationAll;
import test.domain.InformationAllExample;

public interface InformationAllMapper {
    long countByExample(InformationAllExample example);
    List<InformationAll> selectByExample(InformationAllExample example);
    InformationAll selectByPrimaryKey(Integer id);
}