package com.jpkhawam.finalprojectapi.apis.tags;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum TagOrderColumn implements OrderColumn {
    name("tags.name");

    private final String order;

    TagOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
