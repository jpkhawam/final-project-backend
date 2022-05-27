package com.jpkhawam.finalprojectapi.apis.cities;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum CityOrderColumn implements OrderColumn {
    name("cities.name");

    private final String order;

    CityOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
