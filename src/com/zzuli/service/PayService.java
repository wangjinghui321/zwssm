package com.zzuli.service;

import java.util.List;

import com.zzuli.po.MoneyPay;
import com.zzuli.po.PageBean;
import com.zzuli.po.PayVo;

public interface PayService {
	public void paySave(MoneyPay moneyPay)throws Exception;
	
	public List<PayVo> findAll()throws Exception;

	public PageBean<PayVo> findByPage(Integer currPage, Integer pageSize)throws Exception;

	public MoneyPay finById(Integer pay_id)throws Exception;

	public void updateById(MoneyPay moneyPay)throws Exception;

	public void delelteById(Integer pay_id)throws Exception;
}
