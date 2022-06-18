package com.jpkhawam.finalprojectapi.apis.categories;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") CategoryOrderColumn categoryOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(categoryOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.categoryService.getCount(apiRequest));
        response.put("categories", this.categoryService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable() int id) {
        return categoryService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() int id, @RequestBody Category category) {
        category.setId(id);
        categoryService.update(category);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Category category) {
        categoryService.insert(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        categoryService.delete(id);
    }
}
