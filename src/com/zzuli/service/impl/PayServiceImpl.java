package com.zzuli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zzuli.mapper.PayMapper;
import com.zzuli.po.MoneyPay;
import com.zzuli.po.PageBean;
import com.zzuli.po.PageInfo;
import com.zzuli.po.PayVo;
import com.zzuli.service.PayService;

public class PayServiceImpl implements PayService {
	//ע��mapper
	@Autowired
	private PayMapper payMapper;

	@Override
	public void paySave(MoneyPay moneyPay) throws Exception {
		payMapper.paySeve(moneyPay);

	}

	@Override
	public List<PayVo> findAll() throws Exception {
		
		return payMapper.findAll();
	}
	
	/**
	 * ��ҳ��ѯ
	 */
	@Override
	public PageBean<PayVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<PayVo> pageBean = new PageBean<PayVo>();
		//��װ��ǰҳ
		pageBean.setCurrPage(currPage);
		//��װÿҳ��ʾ�ļ�¼��
		pageBean.setPageSize(pageSize);
		//��װ�ܼ�¼��
		Integer totalCount = payMapper.findCount();
		pageBean.setTotalCount(totalCount);
		
		//��װ��ҳ��
		//��ҳ�� = �ܼ�¼��/ÿҳ��ʾ�ļ�¼��������ȡ��
		Double tc = totalCount.doubleValue();
		Double totalPage = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(totalPage.intValue());
		//ÿҳ��ʾ�ļ�¼
		Integer begin = (currPage-1)*pageSize;
		PageInfo pageInfo = new PageInfo();
		pageInfo.setBegin(begin);
		pageInfo.setPageSize(pageSize);
		List<PayVo> list = payMapper.findByPage(pageInfo);
		pageBean.setList(list);
		return pageBean;
	}

	//����id��ѯ�˵�
	@Override
	public MoneyPay finById(Integer pay_id) throws Exception {
		
		return payMapper.findById(pay_id);
	}
	
	//����
	@Override
	public void updateById(MoneyPay moneyPay) throws Exception {
		payMapper.updateById(moneyPay);
		
	}
	//ɾ��
	@Override
	public void delelteById(Integer pay_id) throws Exception {
		payMapper.deleteById(pay_id);
		
	}

}
