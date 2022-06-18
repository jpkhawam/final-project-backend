package com.jpkhawam.finalprojectapi.apis.cities;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") CityOrderColumn cityOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(cityOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.cityService.getCount(apiRequest));
        response.put("cities", this.cityService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public City getById(@PathVariable() UUID id) {
        return cityService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody City city) {
        city.setId(id);
        cityService.update(city);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid City city) {
        cityService.insert(city);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        cityService.delete(id);
    }
}
