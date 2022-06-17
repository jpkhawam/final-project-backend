package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.UUID;

@Mapper
public interface ReviewMapper extends BaseMapper<Review> {
    List<Review> selectByActivityId(UUID activity_id);
    List<Review> selectByFamilyId(UUID family_id);
}
