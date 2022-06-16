package com.jpkhawam.finalprojectapi.apis.families;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum FamilyOrderColumn implements OrderColumn {
    name("families.name");

    private final String order;

    FamilyOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
