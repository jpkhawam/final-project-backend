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
    //  private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);

    final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping()
    public Map<String, Object> getAll(@RequestParam(name = "orderColumn", required = false, defaultValue = "name") ReviewOrderColumn reviewOrderColumn, @RequestParam(name = "orderDirection", required = false, defaultValue = "ascending") OrderDirection orderDirection, @RequestParam(name = "limit", required = false) Integer limit, @RequestParam(name = "offset", required = false) Integer offset) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setOrderColumn(reviewOrderColumn);
        apiRequest.setOrderDirection(orderDirection);
        apiRequest.setLimit(limit);
        apiRequest.setOffset(offset);

        Map<String, Object> response = new HashMap<>();
        response.put("count", this.reviewService.getCount(apiRequest));
        response.put("reviews", this.reviewService.getAll(apiRequest));
        return response;
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable() UUID id) {
        return reviewService.getById(id);
    }

    @GetMapping("/family_id/{id}")
    public Review getByFamilyId(@PathVariable() UUID id) {
        return reviewService.getByFamilyId(id);
    }

    @GetMapping("/activity_id/{id}")
    public Review getByActivityId(@PathVariable() UUID id) {
        return reviewService.getByActivityId(id);
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
