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
    //  private static final Logger logger = LoggerFactory.getLogger(FamilyController.class);

    final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") FamilyOrderColumn familyOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(familyOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.familyService.getCount(apiRequest));
        response.put("families", this.familyService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Family getById(@PathVariable() UUID id) {
        return familyService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody Family family) {
        family.setId(id);
        familyService.update(family);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Family family) {
        familyService.insert(family);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        familyService.delete(id);
    }
}
