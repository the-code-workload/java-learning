package com.learning.inheritance;

public class Fund {
    String fundName;
    int fundNumber;

    public Fund(String fundName, int fundNumber) {
        this.fundName = fundName;
        this.fundNumber = fundNumber;
    }

    public Fund() {
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public int getFundNumber() {
        return fundNumber;
    }

    public void setFundNumber(int fundNumber) {
        this.fundNumber = fundNumber;
    }
}
