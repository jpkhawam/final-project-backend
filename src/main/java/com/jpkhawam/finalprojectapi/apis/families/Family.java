package com.jpkhawam.finalprojectapi.apis.families;

import com.jpkhawam.finalprojectapi.apis.BaseDomain;

import java.util.UUID;

public class Family extends BaseDomain {
    public String email;
    public UUID city_id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getCity_id() {
        return city_id;
    }

    public void setCity_id(UUID city_id) {
        this.city_id = city_id;
    }
}
