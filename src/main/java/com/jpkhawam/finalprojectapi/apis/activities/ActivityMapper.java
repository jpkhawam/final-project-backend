package com.jpkhawam.finalprojectapi.apis.activities;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
interface ActivityMapper extends BaseMapper<Activity> {
    Integer selectCountByCityId(ApiRequest apiRequest);
}
