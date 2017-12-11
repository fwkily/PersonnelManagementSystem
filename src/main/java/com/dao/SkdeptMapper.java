package com.dao;

import com.bean.Skdept;
import com.bean.SkdeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkdeptMapper {
    long countByExample(SkdeptExample example);

    int deleteByExample(SkdeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Skdept record);

    int insertSelective(Skdept record);

    List<Skdept> selectByExample(SkdeptExample example);

    Skdept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Skdept record, @Param("example") SkdeptExample example);

    int updateByExample(@Param("record") Skdept record, @Param("example") SkdeptExample example);

    int updateByPrimaryKeySelective(Skdept record);

    int updateByPrimaryKey(Skdept record);
}