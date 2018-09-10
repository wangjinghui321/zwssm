package com.zzuli.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzuli.po.MoneyPay;
import com.zzuli.po.PageBean;
import com.zzuli.po.PayVo;
import com.zzuli.service.PayService;

@Controller
public class PayController {
	// 注入service
	@Autowired
	private PayService payService;

	// 跳转到新增页面
	@RequestMapping("/paySaveUI")
	public String saveUI() throws Exception {
		return "/pay/add.jsp";
	}

	// 保存账单信息
	@RequestMapping("/paySave")
	public String paySave(MoneyPay moneyPay) throws Exception {
		payService.paySave(moneyPay);

		return "redirect:/payFindAll.action";
	}

	// 查询所有
	@RequestMapping("/payFindAll")
	public String findAll(
			Model model,
			@RequestParam(value = "currPage", required = true, defaultValue = "1") Integer currPage,
			@RequestParam(value = "pageSize", required = true, defaultValue = "5") Integer pageSize)
			throws Exception {
		PageBean<PayVo> pageBean = payService.findByPage(currPage,pageSize);
		model.addAttribute("pageBean", pageBean);
		/*List<PayVo> list = payService.findAll();
		model.addAttribute("list", list);*/
		return "/pay/list.jsp";
	}
	
	//跳转到修改页面
	@RequestMapping("/payEdit")
	public String payEdit(Model model ,Integer pay_id)throws Exception{
		//根据id查询
		MoneyPay payVo = payService.finById(pay_id);
		String formatTime = new SimpleDateFormat("yyyy-MM-dd").format(payVo.getPay_time());
		model.addAttribute("formatTime", formatTime);
		model.addAttribute("payVo", payVo);
		return "/pay/edit.jsp";
	}
	
	//更新账单
	@RequestMapping("/payUpdate")
	public String payUpdate(MoneyPay moneyPay)throws Exception{
		payService.updateById(moneyPay);
		return "redirect:/payFindAll.action";
	}
	
	//删除
	@RequestMapping("/payDelete")
	public String payDelete(Integer pay_id)throws Exception{
		payService.delelteById(pay_id);
		return "redirect:/payFindAll.action";
	}

}
