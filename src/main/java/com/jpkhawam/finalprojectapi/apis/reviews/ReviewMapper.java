package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.UUID;

@Mapper
public interface ReviewMapper extends BaseMapper<Review> {
    Review selectByActivityId(UUID activity_id);
    Review selectByFamilyId(UUID family_id);
}
