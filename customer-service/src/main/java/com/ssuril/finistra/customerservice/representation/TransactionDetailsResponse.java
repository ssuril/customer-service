package com.ssuril.finistra.customerservice.representation;


public class TransactionDetailsResponse {

    String Ccy;
    Double totalTransactedAmtForCcy;

    public String getCcy() {
        return Ccy;
    }

    public void setCcy(String ccy) {
        Ccy = ccy;
    }

    public Double getTotalTransactedAmtForCcy() {
        return totalTransactedAmtForCcy;
    }

    public void setTotalTransactedAmtForCcy(Double totalTransactedAmtForCcy) {
        this.totalTransactedAmtForCcy = totalTransactedAmtForCcy;
    }
}
