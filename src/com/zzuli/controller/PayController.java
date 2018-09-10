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
	// ע��service
	@Autowired
	private PayService payService;

	// ��ת������ҳ��
	@RequestMapping("/paySaveUI")
	public String saveUI() throws Exception {
		return "/pay/add.jsp";
	}

	// �����˵���Ϣ
	@RequestMapping("/paySave")
	public String paySave(MoneyPay moneyPay) throws Exception {
		payService.paySave(moneyPay);

		return "redirect:/payFindAll.action";
	}

	// ��ѯ����
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
	
	//��ת���޸�ҳ��
	@RequestMapping("/payEdit")
	public String payEdit(Model model ,Integer pay_id)throws Exception{
		//����id��ѯ
		MoneyPay payVo = payService.finById(pay_id);
		String formatTime = new SimpleDateFormat("yyyy-MM-dd").format(payVo.getPay_time());
		model.addAttribute("formatTime", formatTime);
		model.addAttribute("payVo", payVo);
		return "/pay/edit.jsp";
	}
	
	//�����˵�
	@RequestMapping("/payUpdate")
	public String payUpdate(MoneyPay moneyPay)throws Exception{
		payService.updateById(moneyPay);
		return "redirect:/payFindAll.action";
	}
	
	//ɾ��
	@RequestMapping("/payDelete")
	public String payDelete(Integer pay_id)throws Exception{
		payService.delelteById(pay_id);
		return "redirect:/payFindAll.action";
	}

}
