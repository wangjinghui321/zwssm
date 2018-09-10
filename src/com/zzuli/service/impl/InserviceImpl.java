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

	// ע��mapper
	@Autowired
	private MoneyInMapper moneyInMapper;

	@Autowired
	private InMapper inMapper;

	// ����
	@Override
	public void inSave(MoneyIn moneyIn) throws Exception {
		moneyInMapper.insert(moneyIn);

	}

	@Override
	public PageBean<InVo> findByPage(Integer currPage, Integer pageSize)
			throws Exception {
		PageBean<InVo> pageBean = new PageBean<InVo>();
		// ��װ��ǰҳ
		pageBean.setCurrPage(currPage);
		// ��װÿҳ��ʾ�ļ�¼��
		pageBean.setPageSize(pageSize);
		// ��װ�ܼ�¼��
		Integer totalCount = inMapper.findCount();
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
		List<InVo> list = inMapper.findByPage(pageInfo);
		pageBean.setList(list);
		return pageBean;
	}

	// ͨ��id��ѯ
	@Override
	public MoneyIn findById(Integer inId) throws Exception {
		return moneyInMapper.selectByPrimaryKey(inId);
	}
	//���²���
	@Override
	public void inUpdate(MoneyIn moneyIn) throws Exception {
		inMapper.updateById(moneyIn);
		
	}
	//ɾ��
	@Override
	public void deleteById(Integer inId) throws Exception {
		moneyInMapper.deleteByPrimaryKey(inId);
		
	}

}
