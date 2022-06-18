package com.jpkhawam.finalprojectapi.apis.tags;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    final TagMapper tagMapper;

    public TagService(TagMapper tagMapper) {
        this.tagMapper = tagMapper;
    }

    public List<Tag> getAll(ApiRequest apiRequest) {
        return tagMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.tagMapper.selectCount(apiRequest);
    }

    public Tag getById(int id) {
        return tagMapper.selectById(id);
    }

    public void update(Tag tag) {
        tagMapper.update(tag);
    }

    public void insert(Tag tag) {
        tagMapper.insert(tag);
    }

    public void delete(int id) {
        tagMapper.delete(id);
    }
}
