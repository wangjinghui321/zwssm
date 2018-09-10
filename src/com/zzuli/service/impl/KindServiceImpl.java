package com.zzuli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zzuli.mapper.KindMapper;
import com.zzuli.po.MoneyKind;
import com.zzuli.service.KindService;

public class KindServiceImpl implements KindService {
	//×¢Èëmapper
	@Autowired
	private KindMapper kindMapper;

	@Override
	public List<MoneyKind> findByKindCode(String kind_code) throws Exception {
		
		return kindMapper.findByKindCode(kind_code);
	}

}
