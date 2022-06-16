package com.jpkhawam.finalprojectapi.apis.family_members;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum FamilyMemberOrderColumn implements OrderColumn {
    name("family_members.name");

    private final String order;

    FamilyMemberOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
