package com.jpkhawam.finalprojectapi.apis.categories;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    final CategoryMapper categoryMapper;

    public CategoryService(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    public List<Category> getAll(ApiRequest apiRequest) {
        return categoryMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.categoryMapper.selectCount(apiRequest);
    }

    public Category getById(int id) {
        return categoryMapper.selectById(id);
    }

    public void update(Category category) {
        categoryMapper.update(category);
    }

    public void insert(Category category) {
        categoryMapper.insert(category);
    }

    public void delete(int id) {
        categoryMapper.delete(id);
    }
}
