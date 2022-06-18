package com.jpkhawam.finalprojectapi.apis.special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/special_needs")
public class SpecialNeedController {
    final SpecialNeedService specialNeedService;

    public SpecialNeedController(SpecialNeedService specialNeedService) {
        this.specialNeedService = specialNeedService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") SpecialNeedOrderColumn specialNeedOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(specialNeedOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.specialNeedService.getCount(apiRequest));
        response.put("special_needs", this.specialNeedService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public SpecialNeed getById(@PathVariable() int id) {
        return specialNeedService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() int id, @RequestBody SpecialNeed specialNeed) {
        specialNeed.setId(id);
        specialNeedService.update(specialNeed);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid SpecialNeed specialNeed) {
        specialNeedService.insert(specialNeed);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        specialNeedService.delete(id);
    }
}
