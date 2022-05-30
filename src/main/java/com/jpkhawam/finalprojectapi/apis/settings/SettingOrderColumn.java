package com.jpkhawam.finalprojectapi.apis.settings;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum SettingOrderColumn implements OrderColumn {
    name("settings.name");

    private final String order;

    SettingOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
