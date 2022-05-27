package com.jpkhawam.finalprojectapi.apis.cities;

import com.jpkhawam.finalprojectapi.apis.BaseDomain;

public class City extends BaseDomain {
    public String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
