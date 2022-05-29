package com.jpkhawam.finalprojectapi.apis.activity_types;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum ActivityTypeOrderColumn implements OrderColumn {
    name("activity_types.name");

    private final String order;

    ActivityTypeOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
