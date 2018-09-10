package com.zzuli.service;

import java.util.List;

import com.zzuli.po.MoneyKind;

public interface KindService {
	public List<MoneyKind> findByKindCode(String kind_code) throws Exception;
}
