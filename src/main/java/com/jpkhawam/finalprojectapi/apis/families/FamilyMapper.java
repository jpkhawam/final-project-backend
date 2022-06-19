package com.jpkhawam.finalprojectapi.apis.families;

import com.jpkhawam.finalprojectapi.apis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FamilyMapper extends BaseMapper<Family> {
    Family selectByEmail(String email);

    void delete(String email);
}
