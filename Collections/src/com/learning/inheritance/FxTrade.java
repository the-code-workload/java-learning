package com.learning.inheritance;

public class FxTrade extends Trade {

    String currency;

    public FxTrade(long tradeId, String traderName, double tradeAmount, int noOfFunds, String currency) {
        super(tradeId, traderName, tradeAmount, noOfFunds);
        this.currency = currency;
    }

    public FxTrade(String currency) {
        super();
        this.currency = currency;
    }

    public FxTrade() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public void showTradeDetails() {

        System.out.println(this.currency + " trade placed with number of funds:" +
                this.noOfFunds + ",for trade amount " + this.tradeAmount + " by " +
                this.traderName + ". Fund details (Fund Name and Number):" + this.fund.getFundName() + "," + this.fund.getFundNumber() + "."

        );

    }

//    @Override
//    public String toString() {
//        return "FxTrade{" +
//                "currency='" + currency + '\'' +
//                ", tradeId=" + tradeId +
//                ", traderName='" + traderName + '\'' +
//                ", tradeAmount=" + tradeAmount +
//                ", noOfFunds=" + noOfFunds +
//                ", fund=" + fund +
//                '}';
//    }
}
