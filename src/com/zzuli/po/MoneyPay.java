package com.zzuli.po;

import java.util.Date;

public class MoneyPay {
	private Integer pay_id;
	private String pay_money;
	private Date pay_time;
	private String pay_memo;
	private String pay_kind;
	public Integer getPay_id() {
		return pay_id;
	}
	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}
	public String getPay_money() {
		return pay_money;
	}
	public void setPay_money(String pay_money) {
		this.pay_money = pay_money;
	}
	public Date getPay_time() {
		return pay_time;
	}
	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}
	public String getPay_memo() {
		return pay_memo;
	}
	public void setPay_memo(String pay_memo) {
		this.pay_memo = pay_memo;
	}
	public String getPay_kind() {
		return pay_kind;
	}
	public void setPay_kind(String pay_kind) {
		this.pay_kind = pay_kind;
	}

	
}
