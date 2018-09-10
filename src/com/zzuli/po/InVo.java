package com.zzuli.po;

import java.util.Date;

public class InVo {
	private Integer inId;

	private String inMoney;

	private Date inTime;

	private String inMemo;
	
	private String kind_item;

	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public String getInMoney() {
		return inMoney;
	}

	public void setInMoney(String inMoney) {
		this.inMoney = inMoney;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public String getInMemo() {
		return inMemo;
	}

	public void setInMemo(String inMemo) {
		this.inMemo = inMemo;
	}

	public String getKind_item() {
		return kind_item;
	}

	public void setKind_item(String kind_item) {
		this.kind_item = kind_item;
	}
}
