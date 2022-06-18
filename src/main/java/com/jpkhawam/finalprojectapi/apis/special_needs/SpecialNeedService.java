package com.jpkhawam.finalprojectapi.apis.special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialNeedService {
    final SpecialNeedMapper specialNeedMapper;

    public SpecialNeedService(SpecialNeedMapper specialNeedMapper) {
        this.specialNeedMapper = specialNeedMapper;
    }

    public List<SpecialNeed> getAll(ApiRequest apiRequest) {
        return specialNeedMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.specialNeedMapper.selectCount(apiRequest);
    }

    public SpecialNeed getById(int id) {
        return specialNeedMapper.selectById(id);
    }

    public void update(SpecialNeed specialNeed) {
        specialNeedMapper.update(specialNeed);
    }

    public void insert(SpecialNeed specialNeed) {
        specialNeedMapper.insert(specialNeed);
    }

    public void delete(int id) {
        specialNeedMapper.delete(id);
    }
}
