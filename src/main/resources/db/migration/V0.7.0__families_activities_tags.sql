CREATE TABLE families_activities_tags
(
    id          UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    family_id   UUID    NOT NULL,
    activity_id UUID    NOT NULL,
    tag_id      INTEGER NOT NULL,
    CONSTRAINT fk_families_activities_tags_family_id FOREIGN KEY (family_id) REFERENCES families (id),
    CONSTRAINT fk_families_activities_tags_activity_id FOREIGN KEY (activity_id) REFERENCES activities (id),
    CONSTRAINT fk_families_activities_tags_tag_id FOREIGN KEY (tag_id) REFERENCES tags (id)
);
