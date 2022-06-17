package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.OrderColumn;

public enum ReviewOrderColumn implements OrderColumn {
    name("reviews.rating");

    private final String order;

    ReviewOrderColumn(String order) {
        this.order = order;
    }

    public String getColumn() {
        return order;
    }
}
