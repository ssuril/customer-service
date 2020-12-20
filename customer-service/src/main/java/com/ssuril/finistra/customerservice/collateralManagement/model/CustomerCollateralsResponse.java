package com.ssuril.finistra.customerservice.collateralManagement.model;


import java.util.ArrayList;
import java.util.List;

public class CustomerCollateralsResponse {
  private List<Collaterals> items = new ArrayList<>();

  public List<Collaterals> getItems() {
    return items;
  }

  public void setItems(List<Collaterals> items) {
    this.items = items;
  }
}

