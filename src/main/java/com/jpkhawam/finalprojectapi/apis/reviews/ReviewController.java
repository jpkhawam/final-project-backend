package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import com.jpkhawam.finalprojectapi.apis.BaseController;
import com.jpkhawam.finalprojectapi.apis.OrderDirection;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController extends BaseController {
    final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping()
    public Map<String, Object> getAll(
            @RequestParam(name = "orderColumn", required = false, defaultValue = "name") ReviewOrderColumn reviewOrderColumn,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "offset", required = false) Integer offset,
            @RequestParam(name = "activity_id", required = false) UUID activity_id,
            @RequestParam(name = "family_id", required = false) UUID family_id) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(reviewOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);
        apiRequest.setActivity_id(activity_id);
        apiRequest.setFamily_id(family_id);

        Map<String, Object> response = new HashMap<>();
        if (activity_id == null && family_id == null)
            response.put("count", this.reviewService.getCount(apiRequest));
        else if (activity_id != null)
            response.put("count", this.reviewService.getCountByActivityId(apiRequest));
        else
            response.put("count", this.reviewService.getCountByFamilyId(apiRequest));
        response.put("reviews", this.reviewService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable() UUID id) {
        return reviewService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable() UUID id, @RequestBody Review review) {
        review.setId(id);
        reviewService.update(review);
    }

    @PostMapping("")
    public void insert(@RequestBody @Valid Review review) {
        reviewService.insert(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() UUID id) {
        reviewService.delete(id);
    }
}
