package com.jpkhawam.finalprojectapi.apis.family_members;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FamilyMemberService {
    final FamilyMemberMapper familyMemberMapper;

    public FamilyMemberService(FamilyMemberMapper familyMemberMapper) {
        this.familyMemberMapper = familyMemberMapper;
    }

    public List<FamilyMember> getAll(ApiRequest apiRequest) {
        return familyMemberMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.familyMemberMapper.selectCount(apiRequest);
    }

    public FamilyMember getById(UUID id) {
        return familyMemberMapper.selectById(id);
    }

    public void update(FamilyMember familyMember) {
        familyMemberMapper.update(familyMember);
    }

    public void insert(FamilyMember familyMember) {
        familyMemberMapper.insert(familyMember);
    }

    public void delete(UUID id) {
        familyMemberMapper.delete(id);
    }
}
