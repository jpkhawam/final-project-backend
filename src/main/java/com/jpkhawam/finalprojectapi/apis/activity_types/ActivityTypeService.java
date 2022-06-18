package com.jpkhawam.finalprojectapi.apis.activity_types;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityTypeService {
    final ActivityTypeMapper activityTypeMapper;

    public ActivityTypeService(ActivityTypeMapper activityTypeMapper) {
        this.activityTypeMapper = activityTypeMapper;
    }

    public List<ActivityType> getAll(ApiRequest apiRequest) {
        return activityTypeMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.activityTypeMapper.selectCount(apiRequest);
    }

    public ActivityType getById(int id) {
        return activityTypeMapper.selectById(id);
    }

    public void update(ActivityType activityType) {
        activityTypeMapper.update(activityType);
    }

    public void insert(ActivityType activityType) {
        activityTypeMapper.insert(activityType);
    }

    public void delete(int id) {
        activityTypeMapper.delete(id);
    }
}
