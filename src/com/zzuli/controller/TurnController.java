package com.zzuli.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzuli.po.MoneyTurn;
import com.zzuli.po.PageBean;
import com.zzuli.po.TurnVo;
import com.zzuli.service.TurnService;

@Controller
public class TurnController {
	// 注入service
	@Autowired
	private TurnService turnService;

	@RequestMapping("/turnSaveUI")
	// 跳转到添加页面
	public String turnSaveUI() throws Exception {

		return "/turn/add.jsp";
	}

	// 保存操作
	@RequestMapping("/turnSave")
	public String turnSave(MoneyTurn moneyTurn) throws Exception {

		turnService.turnSave(moneyTurn);
		return "/turnFindAll.action";
	}

	// 查询列表
	@RequestMapping("/turnFindAll")
	public String turnFindAll(
			Model model,
			@RequestParam(value = "currPage", required = true, defaultValue = "1") Integer currPage,
			@RequestParam(value = "pageSize", required = true, defaultValue = "5") Integer pageSize)
			throws Exception {
		PageBean<TurnVo> pageBean = turnService.findByPage(currPage, pageSize);
		model.addAttribute("pageBean", pageBean);
		return "/turn/list.jsp";
	}
	
	//跳转到修改页面
	@RequestMapping("/turnEdit")
	public String turnEdit(Model model,Integer turnId)throws Exception{
			MoneyTurn moneyTurn = turnService.findById(turnId);
			String formatTime = new SimpleDateFormat("yyyy-MM-dd").format(moneyTurn.getTurnTime());
			model.addAttribute("formatTime", formatTime);
			model.addAttribute("moneyTurn", moneyTurn);
		return"/turn/edit.jsp";
	}
	
	//修改操作
	@RequestMapping("/turnUpdate")
	public String turnUpdate(MoneyTurn moneyTurn)throws Exception{
		turnService.updateById(moneyTurn);
		return "/turnFindAll.action";
	}
	
	//删除操作
	@RequestMapping("/turnDelete")
	public String turnDelete(Integer turnId)throws Exception{
		
		turnService.deleteById(turnId);
		
		return "/turnFindAll.action";
	}
}
