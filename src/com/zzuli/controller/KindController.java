package com.zzuli.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzuli.po.MoneyKind;
import com.zzuli.service.KindService;

@Controller
public class KindController {
	// 注入service
	@Autowired
	private KindService kindService;

	// 查询种类
	@ResponseBody
	@RequestMapping("/findByKindCode")
	public List<MoneyKind> findByKindCode(
			HttpServletResponse response,MoneyKind moneyKind)
			throws Exception {
		List<MoneyKind> list = kindService.findByKindCode(moneyKind.getKind_code());
		
		return list;
		

	}

}
