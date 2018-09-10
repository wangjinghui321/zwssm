package com.zzuli.po;

import java.util.Date;

public class TurnVo {
	private Integer turnId;

	private String turnMoney;

	private Date turnTime;

	private String turnMemo;
	
	private String kind_item;

	public Integer getTurnId() {
		return turnId;
	}

	public void setTurnId(Integer turnId) {
		this.turnId = turnId;
	}

	public String getTurnMoney() {
		return turnMoney;
	}

	public void setTurnMoney(String turnMoney) {
		this.turnMoney = turnMoney;
	}

	public Date getTurnTime() {
		return turnTime;
	}

	public void setTurnTime(Date turnTime) {
		this.turnTime = turnTime;
	}

	public String getTurnMemo() {
		return turnMemo;
	}

	public void setTurnMemo(String turnMemo) {
		this.turnMemo = turnMemo;
	}

	public String getKind_item() {
		return kind_item;
	}

	public void setKind_item(String kind_item) {
		this.kind_item = kind_item;
	}
	
}
