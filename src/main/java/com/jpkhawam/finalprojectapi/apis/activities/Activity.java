package com.jpkhawam.finalprojectapi.apis.activities;

import com.jpkhawam.finalprojectapi.apis.BaseDomain;

import java.util.UUID;

public class Activity extends BaseDomain {
    public String description;
    public int category_id;
    public int activity_type_id;
    public UUID city_id;
    public int setting_id;
    public String coordinates;
    public String gmaps_link;
    public String image_url;
    public int min_age;
    public int max_age;
    public int energy_level;
    public int budget;
    public boolean pets_allowed;
    public String contact_number;
    public String email;
    public String website;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getActivity_type_id() {
        return activity_type_id;
    }

    public void setActivity_type_id(int activity_type_id) {
        this.activity_type_id = activity_type_id;
    }

    public UUID getCity_id() {
        return city_id;
    }

    public void setCity_id(UUID city_id) {
        this.city_id = city_id;
    }

    public int getSetting_id() {
        return setting_id;
    }

    public void setSetting_id(int setting_id) {
        this.setting_id = setting_id;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getGmaps_link() {
        return gmaps_link;
    }

    public void setGmaps_link(String gmaps_link) {
        this.gmaps_link = gmaps_link;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }

    public int getEnergy_level() {
        return energy_level;
    }

    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public boolean isPets_allowed() {
        return pets_allowed;
    }

    public void setPets_allowed(boolean pets_allowed) {
        this.pets_allowed = pets_allowed;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
