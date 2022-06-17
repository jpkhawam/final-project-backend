package com.jpkhawam.finalprojectapi.apis.reviews;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewService {
    //  private static final Logger logger = LoggerFactory.getLogger(ReviewService.class);

    final ReviewMapper reviewMapper;

    public ReviewService(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    public List<Review> getAll(ApiRequest apiRequest) {
        return reviewMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.reviewMapper.selectCount(apiRequest);
    }

    public Review getById(UUID id) {
        return reviewMapper.selectById(id);
    }

    public void update(Review review) {
        reviewMapper.update(review);
    }

    public void insert(Review review) {
        reviewMapper.insert(review);
    }

    public void delete(UUID id) {
        reviewMapper.delete(id);
    }
}
