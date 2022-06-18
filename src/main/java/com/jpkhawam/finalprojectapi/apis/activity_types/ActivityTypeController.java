package com.jpkhawam.finalprojectapi.apis.activity_types;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/activity_types")
public class ActivityTypeController {
    final ActivityTypeService activityTypeService;

    public ActivityTypeController(ActivityTypeService activityTypeService) {
        this.activityTypeService = activityTypeService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") ActivityTypeOrderColumn activityTypeOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(activityTypeOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.activityTypeService.getCount(apiRequest));
        response.put("activity_types", this.activityTypeService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public ActivityType getById(@PathVariable() int id) {
        return activityTypeService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() int id, @RequestBody ActivityType activityType) {
        activityType.setId(id);
        activityTypeService.update(activityType);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid ActivityType activityType) {
        activityTypeService.insert(activityType);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        activityTypeService.delete(id);
    }
}
