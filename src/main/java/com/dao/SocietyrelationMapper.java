package com.dao;

import com.bean.Societyrelation;
import com.bean.SocietyrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocietyrelationMapper {
    long countByExample(SocietyrelationExample example);

    int deleteByExample(SocietyrelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Societyrelation record);

    int insertSelective(Societyrelation record);

    List<Societyrelation> selectByExample(SocietyrelationExample example);

    Societyrelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Societyrelation record, @Param("example") SocietyrelationExample example);

    int updateByExample(@Param("record") Societyrelation record, @Param("example") SocietyrelationExample example);

    int updateByPrimaryKeySelective(Societyrelation record);

    int updateByPrimaryKey(Societyrelation record);
}