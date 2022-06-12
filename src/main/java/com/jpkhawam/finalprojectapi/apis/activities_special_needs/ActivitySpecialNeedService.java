package com.jpkhawam.finalprojectapi.apis.activities_special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ActivitySpecialNeedService {
    //  private static final Logger logger = LoggerFactory.getLogger(ActivitySpecialNeedService.class);

    final ActivitySpecialNeedMapper activitySpecialNeedMapper;

    public ActivitySpecialNeedService(ActivitySpecialNeedMapper activitySpecialNeedMapper) {
        this.activitySpecialNeedMapper = activitySpecialNeedMapper;
    }

    public List<ActivitySpecialNeed> getAll(ApiRequest apiRequest) {
        return activitySpecialNeedMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.activitySpecialNeedMapper.selectCount(apiRequest);
    }

    public ActivitySpecialNeed getById(UUID id) {
        return activitySpecialNeedMapper.selectById(id);
    }

    public void update(ActivitySpecialNeed activitySpecialNeed) {
        activitySpecialNeedMapper.update(activitySpecialNeed);
    }

    public void insert(ActivitySpecialNeed activitySpecialNeed) {
        activitySpecialNeedMapper.insert(activitySpecialNeed);
    }

    public void delete(UUID id) {
        activitySpecialNeedMapper.delete(id);
    }
}
