package com.jpkhawam.finalprojectapi.apis.activities_special_needs;

import java.util.UUID;

public class ActivitySpecialNeed {
    private UUID id;
    private UUID activity_id;
    private int special_need_id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(UUID activity_id) {
        this.activity_id = activity_id;
    }

    public int getSpecial_need_id() {
        return special_need_id;
    }

    public void setSpecial_need_id(int special_need_id) {
        this.special_need_id = special_need_id;
    }
}
