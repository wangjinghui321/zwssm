package com.zzuli.mapper;

import java.util.List;

import com.zzuli.po.PageInfo;
import com.zzuli.po.TurnVo;

public interface TurnMapper {

	public Integer findCount()throws Exception;

	public List<TurnVo> findByPage(PageInfo pageInfo)throws Exception;

}
