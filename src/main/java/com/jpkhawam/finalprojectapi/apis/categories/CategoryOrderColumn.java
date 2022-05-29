package com.jpkhawam.finalprojectapi.apis.categories;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum CategoryOrderColumn implements OrderColumn {
    name("categories.name");

    private final String order;

    CategoryOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
