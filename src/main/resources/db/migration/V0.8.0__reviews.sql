CREATE TABLE reviews
(
    id          UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    family_id   UUID    NOT NULL,
    activity_id UUID    NOT NULL,
    rating      INTEGER NOT NULL CHECK ( rating > 0 AND rating <= 5 ),
    comment     TEXT,
    CONSTRAINT fk_reviews_family_id FOREIGN KEY (family_id) REFERENCES families (id),
    CONSTRAINT fk_reviews_activity_id FOREIGN KEY (activity_id) REFERENCES activities (id)
);
