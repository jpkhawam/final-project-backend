package com.jpkhawam.finalprojectapi.apis.activities_special_needs;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum ActivitySpecialNeedOrderColumn implements OrderColumn {
    // the column specified (.id) is which to order by
    name("activities_special_needs.id");

    private final String order;

    ActivitySpecialNeedOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
