package com.jpkhawam.finalprojectapi.apis.family_members;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/family_members")
public class FamilyMemberController {
    final FamilyMemberService familyMemberService;

    public FamilyMemberController(FamilyMemberService familyMemberService) {
        this.familyMemberService = familyMemberService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") FamilyMemberOrderColumn familyMemberOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(familyMemberOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.familyMemberService.getCount(apiRequest));
        response.put("family_members", this.familyMemberService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public FamilyMember getById(@PathVariable() UUID id) {
        return familyMemberService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody FamilyMember familyMember) {
        familyMember.setId(id);
        familyMemberService.update(familyMember);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid FamilyMember familyMember) {
        familyMemberService.insert(familyMember);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        familyMemberService.delete(id);
    }
}
