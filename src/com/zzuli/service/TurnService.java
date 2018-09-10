package com.zzuli.service;

import com.zzuli.po.MoneyTurn;
import com.zzuli.po.PageBean;
import com.zzuli.po.TurnVo;

public interface TurnService {

	public void turnSave(MoneyTurn moneyTurn)throws Exception;

	public PageBean<TurnVo> findByPage(Integer currPage, Integer pageSize)throws Exception;

	public MoneyTurn findById(Integer turnId)throws Exception;

	public void deleteById(Integer turnId)throws Exception;

	public void updateById(MoneyTurn moneyTurn)throws Exception;

}
