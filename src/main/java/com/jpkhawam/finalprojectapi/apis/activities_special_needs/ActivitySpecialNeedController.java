package com.jpkhawam.finalprojectapi.apis.activities_special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseController;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/activities_special_needs")
public class ActivitySpecialNeedController extends BaseController {
    final ActivitySpecialNeedService activitySpecialNeedService;

    public ActivitySpecialNeedController(ActivitySpecialNeedService activitySpecialNeedService) {
        this.activitySpecialNeedService = activitySpecialNeedService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") ActivitySpecialNeedOrderColumn activitySpecialNeedOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(activitySpecialNeedOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.activitySpecialNeedService.getCount(apiRequest));
        response.put("activities_special_needs", this.activitySpecialNeedService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public ActivitySpecialNeed getById(@PathVariable() UUID id) {
        return activitySpecialNeedService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody ActivitySpecialNeed activitySpecialNeed) {
        activitySpecialNeed.setId(id);
        activitySpecialNeedService.update(activitySpecialNeed);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid ActivitySpecialNeed activitySpecialNeed) {
        activitySpecialNeedService.insert(activitySpecialNeed);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        activitySpecialNeedService.delete(id);
    }
}
