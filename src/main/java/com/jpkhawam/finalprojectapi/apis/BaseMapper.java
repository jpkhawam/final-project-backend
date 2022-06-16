package com.jpkhawam.finalprojectapi.apis;

import java.util.List;
import java.util.UUID;

public interface BaseMapper<T> {
    T selectById(UUID id);

    List<T> selectAll(ApiRequest apiRequest);

    Integer selectCount(ApiRequest apiRequest);

    void insert(T t);

    void update(T t);

    void delete(UUID id);
}
