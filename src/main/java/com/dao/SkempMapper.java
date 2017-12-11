package com.dao;

import com.bean.Skemp;
import com.bean.SkempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkempMapper {
    long countByExample(SkempExample example);

    int deleteByExample(SkempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Skemp record);

    int insertSelective(Skemp record);

    List<Skemp> selectByExample(SkempExample example);

    Skemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Skemp record, @Param("example") SkempExample example);

    int updateByExample(@Param("record") Skemp record, @Param("example") SkempExample example);

    int updateByPrimaryKeySelective(Skemp record);

    int updateByPrimaryKey(Skemp record);
}