package com.learning.inheritance;

public abstract class Trade {

    long tradeId;
    String traderName;
    double tradeAmount;
    int noOfFunds;
    Fund fund;

    public Trade() {
    }

    public Trade(Fund fund, long tradeId, String traderName, double tradeAmount, int noOfFunds) {
        this.fund = fund;
        this.tradeId = tradeId;
        this.traderName = traderName;
        this.tradeAmount = tradeAmount;
        this.noOfFunds = noOfFunds;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    public long getTradeId() {
        return tradeId;
    }

    public void setTradeId(long tradeId) {
        this.tradeId = tradeId;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public int getNoOfFunds() {
        return noOfFunds;
    }

    public void setNoOfFunds(int noOfFunds) {
        this.noOfFunds = noOfFunds;
    }

    public abstract void showTradeDetails();
}
