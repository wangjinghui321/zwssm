package com.zzuli.po;

import java.util.Date;

public class PayVo {
	//pay_time,pay_money,pay_memo,kind_item
	private Integer pay_id;
	private Date pay_time;
	private String pay_money;
	private String pay_memo;
	private String kind_item;
	
	public Integer getPay_id() {
		return pay_id;
	}
	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}
	public Date getPay_time() {
		return pay_time;
	}
	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}
	public String getPay_money() {
		return pay_money;
	}
	public void setPay_money(String pay_money) {
		this.pay_money = pay_money;
	}
	public String getPay_memo() {
		return pay_memo;
	}
	public void setPay_memo(String pay_memo) {
		this.pay_memo = pay_memo;
	}
	public String getKind_item() {
		return kind_item;
	}
	public void setKind_item(String kind_item) {
		this.kind_item = kind_item;
	}
	

}
