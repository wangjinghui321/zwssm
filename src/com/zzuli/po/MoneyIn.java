package com.zzuli.po;

import java.util.Date;

public class MoneyIn {
    private Integer inId;

    private String inMoney;

    private Date inTime;

    private String inMemo;

    private String inKind;

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
        this.inMoney = inMoney == null ? null : inMoney.trim();
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
        this.inMemo = inMemo == null ? null : inMemo.trim();
    }

    public String getInKind() {
        return inKind;
    }

    public void setInKind(String inKind) {
        this.inKind = inKind == null ? null : inKind.trim();
    }
}