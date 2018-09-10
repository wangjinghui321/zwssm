package com.zzuli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zzuli.mapper.MoneyTurnMapper;
import com.zzuli.mapper.TurnMapper;
import com.zzuli.po.InVo;
import com.zzuli.po.MoneyTurn;
import com.zzuli.po.PageBean;
import com.zzuli.po.PageInfo;
import com.zzuli.po.TurnVo;
import com.zzuli.service.TurnService;

public class TurnServiceImpl implements TurnService {
	//注入mapper
	@Autowired
	private MoneyTurnMapper moneyTurnMapper;
	
	@Autowired
	private TurnMapper turnMapper;
	//保存
	@Override
	public void turnSave(MoneyTurn moneyTurn) throws Exception {
		moneyTurnMapper.insert(moneyTurn);
		
	}
	
	//查询列表，分页查询
	@Override
	public PageBean<TurnVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<TurnVo> pageBean = new PageBean<TurnVo>();
		// 封装当前页
		pageBean.setCurrPage(currPage);
		// 封装每页显示的记录数
		pageBean.setPageSize(pageSize);
		// 封装总记录数
		Integer totalCount = turnMapper.findCount();
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
		List<TurnVo> list = turnMapper.findByPage(pageInfo);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public MoneyTurn findById(Integer turnId) throws Exception {
		
		return moneyTurnMapper.selectByPrimaryKey(turnId);
	}

	@Override
	public void deleteById(Integer turnId) throws Exception {
		moneyTurnMapper.deleteByPrimaryKey(turnId);
		
	}

	@Override
	public void updateById(MoneyTurn moneyTurn) throws Exception {
		moneyTurnMapper.updateByPrimaryKey(moneyTurn);
		
	}

}
