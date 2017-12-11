package com.dao;

import com.bean.Talent;
import com.bean.TalentExample;
import com.bean.TalentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalentMapper {
    long countByExample(TalentExample example);

    int deleteByExample(TalentExample example);

    int deleteByPrimaryKey(TalentKey key);

    int insert(Talent record);

    int insertSelective(Talent record);

    List<Talent> selectByExample(TalentExample example);

    Talent selectByPrimaryKey(TalentKey key);

    int updateByExampleSelective(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByExample(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByPrimaryKeySelective(Talent record);

    int updateByPrimaryKey(Talent record);
}