package com.jpkhawam.finalprojectapi.apis.reviews;

import java.util.UUID;

public class Review {
    public UUID id;
    public UUID family_id;
    public UUID activity_id;
    public int rating;
    public String comment;

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

    public UUID getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(UUID activity_id) {
        this.activity_id = activity_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
