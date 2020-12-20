
package com.ssuril.finistra.customerservice.AccountManagement.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionResponse {

  private String accountId = null;
  private List<Transaction> items = new ArrayList<Transaction>();


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public List<Transaction> getItems() {
    return items;
  }

  public void setItems(List<Transaction> items) {
    this.items = items;
  }
}

