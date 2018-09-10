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
	//注入mapper
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
	 * 分页查询
	 */
	@Override
	public PageBean<PayVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<PayVo> pageBean = new PageBean<PayVo>();
		//封装当前页
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		pageBean.setPageSize(pageSize);
		//封装总记录数
		Integer totalCount = payMapper.findCount();
		pageBean.setTotalCount(totalCount);
		
		//封装总页数
		//总页数 = 总记录数/每页显示的记录数，向上取整
		Double tc = totalCount.doubleValue();
		Double totalPage = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(totalPage.intValue());
		//每页显示的记录
		Integer begin = (currPage-1)*pageSize;
		PageInfo pageInfo = new PageInfo();
		pageInfo.setBegin(begin);
		pageInfo.setPageSize(pageSize);
		List<PayVo> list = payMapper.findByPage(pageInfo);
		pageBean.setList(list);
		return pageBean;
	}

	//根据id查询账单
	@Override
	public MoneyPay finById(Integer pay_id) throws Exception {
		
		return payMapper.findById(pay_id);
	}
	
	//更新
	@Override
	public void updateById(MoneyPay moneyPay) throws Exception {
		payMapper.updateById(moneyPay);
		
	}
	//删除
	@Override
	public void delelteById(Integer pay_id) throws Exception {
		payMapper.deleteById(pay_id);
		
	}

}
