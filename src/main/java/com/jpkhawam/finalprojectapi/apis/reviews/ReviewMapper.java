package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper extends BaseMapper<Review> {
    Integer selectCountByActivityId(ApiRequest apiRequest);

    Integer selectCountByFamilyId(ApiRequest apiRequest);
}
