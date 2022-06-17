package com.jpkhawam.finalprojectapi.apis.tags;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/tags")
public class TagController {
    //  private static final Logger logger = LoggerFactory.getLogger(TagController.class);

    final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") TagOrderColumn tagOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(tagOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.tagService.getCount(apiRequest));
        response.put("tags", this.tagService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Tag getById(@PathVariable() int id) {
        return tagService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() int id, @RequestBody Tag tag) {
        tag.setId(id);
        tagService.update(tag);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Tag tag) {
        tagService.insert(tag);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        tagService.delete(id);
    }
}
