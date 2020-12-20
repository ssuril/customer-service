package com.ssuril.finistra.customerservice.AccountManagement.model;

import java.util.ArrayList;
import java.util.List;

public class SearchAccountsResponse {

    private List<AccountDetail> items = new ArrayList<>();

    public List<AccountDetail> getItems() {
        return items;
    }

    public void setItems(List<AccountDetail> items) {
        this.items = items;
    }
}
