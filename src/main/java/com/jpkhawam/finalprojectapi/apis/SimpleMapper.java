package com.jpkhawam.finalprojectapi.apis;

import java.util.List;

public interface SimpleMapper<T> {
    T selectById(int id);

    List<T> selectAll(ApiRequest apiRequest);

    Integer selectCount(ApiRequest apiRequest);

    void insert(T t);

    int update(T t);

    void delete(int id);
}
