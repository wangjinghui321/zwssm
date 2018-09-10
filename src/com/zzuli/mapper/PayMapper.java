package com.zzuli.mapper;

import java.util.List;

import com.zzuli.po.MoneyPay;
import com.zzuli.po.PageInfo;
import com.zzuli.po.PayVo;

public interface PayMapper {
	public void paySeve(MoneyPay moneyPay)throws Exception;
	
	//��ѯ����
	public List<PayVo> findAll()throws Exception;
	//��ѯ�ܼ�¼��
	public Integer findCount()throws Exception;

	public List<PayVo> findByPage(PageInfo pageInfo)throws Exception;
	//ͨ��id��ѯ
	public MoneyPay findById(Integer pay_id)throws Exception;
	//����
	public void updateById(MoneyPay moneyPay)throws Exception;

	public void deleteById(Integer pay_id)throws Exception;

}
