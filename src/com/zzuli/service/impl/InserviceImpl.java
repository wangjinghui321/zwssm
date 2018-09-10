package com.zzuli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zzuli.mapper.InMapper;
import com.zzuli.mapper.MoneyInMapper;
import com.zzuli.po.InVo;
import com.zzuli.po.MoneyIn;
import com.zzuli.po.PageBean;
import com.zzuli.po.PageInfo;
import com.zzuli.po.PayVo;
import com.zzuli.service.Inservice;

public class InserviceImpl implements Inservice {

	// 注入mapper
	@Autowired
	private MoneyInMapper moneyInMapper;

	@Autowired
	private InMapper inMapper;

	// 保存
	@Override
	public void inSave(MoneyIn moneyIn) throws Exception {
		moneyInMapper.insert(moneyIn);

	}

	@Override
	public PageBean<InVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<InVo> pageBean = new PageBean<InVo>();
		// 封装当前页
		pageBean.setCurrPage(currPage);
		// 封装每页显示的记录数
		pageBean.setPageSize(pageSize);
		// 封装总记录数
		Integer totalCount = inMapper.findCount();
		pageBean.setTotalCount(totalCount);

		// 封装总页数
		// 总页数 = 总记录数/每页显示的记录数，向上取整
		Double tc = totalCount.doubleValue();
		Double totalPage = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(totalPage.intValue());
		// 每页显示的记录
		Integer begin = (currPage - 1) * pageSize;
		PageInfo pageInfo = new PageInfo();
		pageInfo.setBegin(begin);
		pageInfo.setPageSize(pageSize);
		List<InVo> list = inMapper.findByPage(pageInfo);
		pageBean.setList(list);
		return pageBean;
	}

	// 通过id查询
	@Override
	public MoneyIn findById(Integer inId) throws Exception {
		return moneyInMapper.selectByPrimaryKey(inId);
	}
	//更新操作
	@Override
	public void inUpdate(MoneyIn moneyIn) throws Exception {
		inMapper.updateById(moneyIn);
		
	}
	//删除
	@Override
	public void deleteById(Integer inId) throws Exception {
		moneyInMapper.deleteByPrimaryKey(inId);
		
	}

}
