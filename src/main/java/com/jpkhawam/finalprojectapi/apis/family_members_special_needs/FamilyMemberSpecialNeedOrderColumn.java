package com.jpkhawam.finalprojectapi.apis.family_members_special_needs;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum FamilyMemberSpecialNeedOrderColumn implements OrderColumn {
    name("family_members_special_needs.family_id");

    private final String order;

    FamilyMemberSpecialNeedOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
