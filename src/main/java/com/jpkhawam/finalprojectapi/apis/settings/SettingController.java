package com.jpkhawam.finalprojectapi.apis.settings;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/settings")
public class SettingController {
    //  private static final Logger logger = LoggerFactory.getLogger(SettingController.class);

    final SettingService settingService;

    public SettingController(SettingService settingService) {
        this.settingService = settingService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") SettingOrderColumn settingOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(settingOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.settingService.getCount(apiRequest));
        response.put("settings", this.settingService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Setting getById(@PathVariable() int id) {
        return settingService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() int id, @RequestBody Setting setting) {
        setting.setId(id);
        settingService.update(setting);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Setting setting) {
        settingService.insert(setting);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        settingService.delete(id);
    }
}
