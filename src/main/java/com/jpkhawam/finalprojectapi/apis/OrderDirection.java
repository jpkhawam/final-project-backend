package com.jpkhawam.finalprojectapi.apis;

public enum OrderDirection {
    ascending("ASC"), descending("DESC");

    private final String direction;

    OrderDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
