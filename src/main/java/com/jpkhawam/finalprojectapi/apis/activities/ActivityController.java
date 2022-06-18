package com.jpkhawam.finalprojectapi.apis.activities;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseController;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/activities")
public class ActivityController extends BaseController {
    final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") ActivityOrderColumn activityOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset,
            @RequestParam(name = "search", required = false) String search) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(activityOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);
        apiRequest.setSearch(search);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.activityService.getCount(apiRequest));
        response.put("activities", this.activityService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Activity getById(@PathVariable() UUID id) {
        return activityService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody Activity activity) {
        activity.setId(id);
        activityService.update(activity);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Activity activity) {
        activityService.insert(activity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        activityService.delete(id);
    }
}
