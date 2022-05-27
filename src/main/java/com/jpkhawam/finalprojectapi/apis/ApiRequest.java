package com.jpkhawam.finalprojectapi.apis;

public class ApiRequest {
    private OrderColumn orderColumn;
    private OrderDirection orderDirection;
    private Integer limit;
    private Integer offset;

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
}
