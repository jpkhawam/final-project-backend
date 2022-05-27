package com.jpkhawam.finalprojectapi.apis.activities;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {
    //  private static final Logger logger = LoggerFactory.getLogger(ActivityService.class);

    final ActivityMapper activityMapper;

    public ActivityService(ActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }

    public List<Activity> getAll(ApiRequest apiRequest) {
        return activityMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.activityMapper.selectCount(apiRequest);
    }

    public Activity getById(UUID id) {
        return activityMapper.selectById(id);
    }

    public void update(Activity activity) {
        activityMapper.update(activity);
    }

    public void insert(Activity activity) {
        activityMapper.insert(activity);
    }

    public void delete(UUID id) {
        activityMapper.delete(id);
    }
}
