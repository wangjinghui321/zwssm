package com.zzuli.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzuli.po.MoneyIn;
import com.zzuli.po.MoneyInExample;

public interface MoneyInMapper {
    int countByExample(MoneyInExample example);

    int deleteByExample(MoneyInExample example);

    int deleteByPrimaryKey(Integer inId);

    int insert(MoneyIn record);

    int insertSelective(MoneyIn record);

    List<MoneyIn> selectByExample(MoneyInExample example);

    MoneyIn selectByPrimaryKey(Integer inId);

    int updateByExampleSelective(@Param("record") MoneyIn record, @Param("example") MoneyInExample example);

    int updateByExample(@Param("record") MoneyIn record, @Param("example") MoneyInExample example);

    int updateByPrimaryKeySelective(MoneyIn record);

    int updateByPrimaryKey(MoneyIn record);
}