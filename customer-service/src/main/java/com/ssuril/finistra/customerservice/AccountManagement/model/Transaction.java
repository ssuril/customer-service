package com.ssuril.finistra.customerservice.AccountManagement.model;

public class Transaction {

  private String transactionId = null;
  private String description = null;
  private TransactionAmount amount = null;
  private String creditDebitIndicator = null;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionAmount getAmount() {
    return amount;
  }

  public void setAmount(TransactionAmount amount) {
    this.amount = amount;
  }

  public String getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(String creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }
}

