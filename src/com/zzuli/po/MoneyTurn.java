package com.zzuli.po;

import java.util.Date;

public class MoneyTurn {
    private Integer turnId;

    private String turnMoney;

    private Date turnTime;

    private String turnMemo;

    private String turnKind;

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
        this.turnMoney = turnMoney == null ? null : turnMoney.trim();
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
        this.turnMemo = turnMemo == null ? null : turnMemo.trim();
    }

    public String getTurnKind() {
        return turnKind;
    }

    public void setTurnKind(String turnKind) {
        this.turnKind = turnKind == null ? null : turnKind.trim();
    }
}