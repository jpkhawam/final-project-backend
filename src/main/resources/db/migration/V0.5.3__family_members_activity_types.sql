CREATE TABLE family_members_activity_types
(
    id               UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    family_id        UUID    NOT NULL,
    family_member_id UUID    NOT NULL,
    activity_type_id INTEGER NOT NULL,
    CONSTRAINT fk_family_members_activity_types_family_id FOREIGN KEY (family_id) REFERENCES families (id),
    CONSTRAINT family_members_activity_types_family_member_id FOREIGN KEY (family_member_id) REFERENCES family_members (id)
);
