package com.jpkhawam.finalprojectapi.apis.families;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseController;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/families")
public class FamilyController extends BaseController {
    final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") FamilyOrderColumn familyOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset,
            @RequestParam(name = "family_id", required = false) UUID family_id) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(familyOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);
        apiRequest.setFamily_id(family_id);

        Map<String, Object> response = new HashMap<>();
        if (family_id == null)
            response.put("count", this.familyService.getCount(apiRequest));
        else
            response.put("count", 1);
        response.put("families", this.familyService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{email}")
    public Family getByEmail(@PathVariable() String email) {
        return familyService.getByEmail(email);
    }

    @PutMapping("/{email}")
    public void update(@PathVariable() String email, @RequestBody Family family) {
        familyService.update(family);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Family family) {
        familyService.insert(family);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable() String email) {
        familyService.delete(email);
    }
}
