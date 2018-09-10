package com.zzuli.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzuli.po.InVo;
import com.zzuli.po.MoneyIn;
import com.zzuli.po.PageBean;
import com.zzuli.service.Inservice;

@Controller
public class InController {

	// ע��service
	@Autowired
	private Inservice inService;

	@RequestMapping("/inSaveUI")
	public String inSaveUI() throws Exception {

		return "/in/add.jsp";
	}

	// ����
	@RequestMapping("/inSave")
	public String inSave(MoneyIn moneyIn) throws Exception {
		inService.inSave(moneyIn);
		return "redirect:/inFindAll.action";
	}

	// ��ѯ���б�
	@RequestMapping("/inFindAll")
	public String inFindAll(
			Model model,
			@RequestParam(value = "currPage", required = true, defaultValue = "1") Integer currPage,
			@RequestParam(value = "pageSize", required = true, defaultValue = "5") Integer pageSize)
			throws Exception {
		
		PageBean<InVo> pageBean = inService.findByPage(currPage,pageSize);
		model.addAttribute("pageBean", pageBean);

		return "/in/list.jsp";
	}
	
	//��ת���޸�ҳ��
	@RequestMapping("/inEdit")
	public String inEdit(Model model ,Integer inId)throws Exception{
		MoneyIn inVo = inService.findById(inId);
		Date inTime = inVo.getInTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatTime = simpleDateFormat.format(inTime);
		model.addAttribute("inVo", inVo);
		model.addAttribute("formatTime", formatTime);
		return "/in/edit.jsp";
	}
	//����
	@RequestMapping("/inUpdate")
	public String inUpdate(MoneyIn moneyIn)throws Exception{
		inService.inUpdate(moneyIn);
		return "redirect:/inFindAll.action";
	}
	
	//ɾ��
	@RequestMapping("/inDelete")
	public String inDelete(Integer inId)throws Exception{
		inService.deleteById(inId);
		 return "redirect:/inFindAll.action";
	}
	

}
