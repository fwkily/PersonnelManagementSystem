package com.dao;

import com.bean.Skstaff;
import com.bean.SkstaffExample;
import com.bean.SkstaffKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkstaffMapper {
    long countByExample(SkstaffExample example);

    int deleteByExample(SkstaffExample example);

    int deleteByPrimaryKey(SkstaffKey key);

    int insert(Skstaff record);

    int insertSelective(Skstaff record);

    List<Skstaff> selectByExample(SkstaffExample example);

    Skstaff selectByPrimaryKey(SkstaffKey key);

    int updateByExampleSelective(@Param("record") Skstaff record, @Param("example") SkstaffExample example);

    int updateByExample(@Param("record") Skstaff record, @Param("example") SkstaffExample example);

    int updateByPrimaryKeySelective(Skstaff record);

    int updateByPrimaryKey(Skstaff record);
}