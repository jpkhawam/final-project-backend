package com.jpkhawam.finalprojectapi.apis.family_members;

import com.jpkhawam.finalprojectapi.apis.BaseDomain;

import java.util.UUID;

public class FamilyMember extends BaseDomain {
    public UUID family_id;
    public int age;

    public UUID getFamily_id() {
        return family_id;
    }

    public void setFamily_id(UUID family_id) {
        this.family_id = family_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
