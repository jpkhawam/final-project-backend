package com.jpkhawam.finalprojectapi.apis.activities;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum ActivityOrderColumn implements OrderColumn {
    name("activities.name");

    private final String order;

    ActivityOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
