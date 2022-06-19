package com.jpkhawam.finalprojectapi.apis.families;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {
    final FamilyMapper familyMapper;

    public FamilyService(FamilyMapper familyMapper) {
        this.familyMapper = familyMapper;
    }

    public List<Family> getAll(ApiRequest apiRequest) {
        return familyMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.familyMapper.selectCount(apiRequest);
    }

    public Family getByEmail(String email) {
        return familyMapper.selectByEmail(email);
    }

    public void update(Family family) {
        familyMapper.update(family);
    }

    public void insert(Family family) {
        familyMapper.insert(family);
    }

    public void delete(String email) {
        familyMapper.delete(email);
    }
}
