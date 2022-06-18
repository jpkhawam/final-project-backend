package com.jpkhawam.finalprojectapi.apis.family_members_special_needs;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FamilyMemberSpecialNeedService {
    final FamilyMemberSpecialNeedMapper familyMemberSpecialNeedMapper;

    public FamilyMemberSpecialNeedService(FamilyMemberSpecialNeedMapper familyMemberSpecialNeedMapper) {
        this.familyMemberSpecialNeedMapper = familyMemberSpecialNeedMapper;
    }

    public List<FamilyMemberSpecialNeed> getAll(ApiRequest apiRequest) {
        return familyMemberSpecialNeedMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.familyMemberSpecialNeedMapper.selectCount(apiRequest);
    }

    public FamilyMemberSpecialNeed getById(UUID id) {
        return familyMemberSpecialNeedMapper.selectById(id);
    }

    public void update(FamilyMemberSpecialNeed familyMemberSpecialNeed) {
        familyMemberSpecialNeedMapper.update(familyMemberSpecialNeed);
    }

    public void insert(FamilyMemberSpecialNeed familyMemberSpecialNeed) {
        familyMemberSpecialNeedMapper.insert(familyMemberSpecialNeed);
    }

    public void delete(UUID id) {
        familyMemberSpecialNeedMapper.delete(id);
    }
}
