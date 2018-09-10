package com.zzuli.mapper;

import java.util.List;

import com.zzuli.po.InVo;
import com.zzuli.po.MoneyIn;
import com.zzuli.po.PageInfo;

public interface InMapper {
	public Integer findCount()throws Exception;

	public List<InVo> findByPage(PageInfo pageInfo)throws Exception;

	public void updateById(MoneyIn moneyIn)throws Exception;

}
