package com.jpkhawam.finalprojectapi.apis.special_needs;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum SpecialNeedOrderColumn implements OrderColumn {
    name("special_needs.name");

    private final String order;

    SpecialNeedOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
