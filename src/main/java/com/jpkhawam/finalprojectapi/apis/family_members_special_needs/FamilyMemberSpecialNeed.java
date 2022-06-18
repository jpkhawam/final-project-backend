package com.jpkhawam.finalprojectapi.apis.family_members_special_needs;

import java.util.UUID;

public class FamilyMemberSpecialNeed {
    public UUID id;
    public UUID family_id;
    public UUID family_member_id;
    public int special_need_id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getFamily_id() {
        return family_id;
    }

    public void setFamily_id(UUID family_id) {
        this.family_id = family_id;
    }

    public UUID getFamily_member_id() {
        return family_member_id;
    }

    public void setFamily_member_id(UUID family_member_id) {
        this.family_member_id = family_member_id;
    }

    public int getSpecial_need_id() {
        return special_need_id;
    }

    public void setSpecial_need_id(int special_need_id) {
        this.special_need_id = special_need_id;
    }
}
