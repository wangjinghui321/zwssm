package com.zzuli.mapper;

import java.util.List;

import com.zzuli.po.MoneyKind;

public interface KindMapper {
	
	//查询账单种类
	public List<MoneyKind> findByKindCode(String kind_code)throws Exception;
}
