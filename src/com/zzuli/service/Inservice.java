package com.zzuli.service;

import com.zzuli.po.InVo;
import com.zzuli.po.MoneyIn;
import com.zzuli.po.PageBean;

public interface Inservice {
	//±£´æ
	public void inSave(MoneyIn moneyIn)throws Exception;

	public PageBean<InVo> findByPage(Integer currPage, Integer pageSize)throws Exception;

	public MoneyIn findById(Integer inId)throws Exception;

	public void inUpdate(MoneyIn moneyIn)throws Exception;

	public void deleteById(Integer inId)throws Exception; 
}
