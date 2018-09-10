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
	//ע��mapper
	@Autowired
	private MoneyTurnMapper moneyTurnMapper;
	
	@Autowired
	private TurnMapper turnMapper;
	//����
	@Override
	public void turnSave(MoneyTurn moneyTurn) throws Exception {
		moneyTurnMapper.insert(moneyTurn);
		
	}
	
	//��ѯ�б���ҳ��ѯ
	@Override
	public PageBean<TurnVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<TurnVo> pageBean = new PageBean<TurnVo>();
		// ��װ��ǰҳ
		pageBean.setCurrPage(currPage);
		// ��װÿҳ��ʾ�ļ�¼��
		pageBean.setPageSize(pageSize);
		// ��װ�ܼ�¼��
		Integer totalCount = turnMapper.findCount();
		pageBean.setTotalCount(totalCount);

		// ��װ��ҳ��
		// ��ҳ�� = �ܼ�¼��/ÿҳ��ʾ�ļ�¼��������ȡ��
		Double tc = totalCount.doubleValue();
		Double totalPage = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(totalPage.intValue());
		// ÿҳ��ʾ�ļ�¼
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
