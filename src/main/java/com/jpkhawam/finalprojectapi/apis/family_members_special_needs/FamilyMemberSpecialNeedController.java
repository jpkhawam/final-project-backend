package com.jpkhawam.finalprojectapi.apis.family_members_special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/family_members_special_needs")
public class FamilyMemberSpecialNeedController {
    final FamilyMemberSpecialNeedService familyMemberSpecialNeedService;

    public FamilyMemberSpecialNeedController(FamilyMemberSpecialNeedService familyMemberSpecialNeedService) {
        this.familyMemberSpecialNeedService = familyMemberSpecialNeedService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") FamilyMemberSpecialNeedOrderColumn familyMemberSpecialNeedOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(familyMemberSpecialNeedOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.familyMemberSpecialNeedService.getCount(apiRequest));
        response.put("family_members_special_needs", this.familyMemberSpecialNeedService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public FamilyMemberSpecialNeed getById(@PathVariable() UUID id) {
        return familyMemberSpecialNeedService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody FamilyMemberSpecialNeed familyMemberSpecialNeed) {
        familyMemberSpecialNeed.setId(id);
        familyMemberSpecialNeedService.update(familyMemberSpecialNeed);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid FamilyMemberSpecialNeed familyMemberSpecialNeed) {
        familyMemberSpecialNeedService.insert(familyMemberSpecialNeed);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        familyMemberSpecialNeedService.delete(id);
    }
}
