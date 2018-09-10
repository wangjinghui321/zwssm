package com.zzuli.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzuli.po.MoneyTurn;
import com.zzuli.po.MoneyTurnExample;

public interface MoneyTurnMapper {
    int countByExample(MoneyTurnExample example);

    int deleteByExample(MoneyTurnExample example);

    int deleteByPrimaryKey(Integer turnId);

    int insert(MoneyTurn record);

    int insertSelective(MoneyTurn record);

    List<MoneyTurn> selectByExample(MoneyTurnExample example);

    MoneyTurn selectByPrimaryKey(Integer turnId);

    int updateByExampleSelective(@Param("record") MoneyTurn record, @Param("example") MoneyTurnExample example);

    int updateByExample(@Param("record") MoneyTurn record, @Param("example") MoneyTurnExample example);

    int updateByPrimaryKeySelective(MoneyTurn record);

    int updateByPrimaryKey(MoneyTurn record);
}