package com.zzuli.mapper;

import java.util.List;

import com.zzuli.po.MoneyPay;
import com.zzuli.po.PageInfo;
import com.zzuli.po.PayVo;

public interface PayMapper {
	public void paySeve(MoneyPay moneyPay)throws Exception;
	
	//查询所有
	public List<PayVo> findAll()throws Exception;
	//查询总记录数
	public Integer findCount()throws Exception;

	public List<PayVo> findByPage(PageInfo pageInfo)throws Exception;
	//通过id查询
	public MoneyPay findById(Integer pay_id)throws Exception;
	//更新
	public void updateById(MoneyPay moneyPay)throws Exception;

	public void deleteById(Integer pay_id)throws Exception;

}
