package com.jpkhawam.finalprojectapi.apis;

import java.util.UUID;

public class ApiRequest {
    private OrderColumn orderColumn;
    private OrderDirection orderDirection;
    private Integer limit;
    private Integer offset;
    private String search;

    private UUID city_id;

    public OrderColumn getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(OrderColumn orderColumn) {
        this.orderColumn = orderColumn;
    }

    public OrderDirection getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = orderDirection;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = enableWildcard(search);
    }

    private String enableWildcard(String input) {
        if ((input != null) && (input.length() > 0)) {
            return "%" + input + "%";
        } else {
            return input;
        }
    }

    public UUID getCity_id() {
        return city_id;
    }

    public void setCity_id(UUID city_id) {
        this.city_id = city_id;
    }
}
