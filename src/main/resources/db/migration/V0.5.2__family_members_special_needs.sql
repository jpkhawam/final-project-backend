CREATE TABLE family_members_special_needs
(
    id               UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    family_id        UUID    NOT NULL,
    family_member_id UUID    NOT NULL,
    special_need_id  INTEGER NOT NULL,
    CONSTRAINT fk_family_members_special_needs_family_id FOREIGN KEY (family_id) REFERENCES families (id),
    CONSTRAINT fk_family_members_special_needs_family_member_id FOREIGN KEY (family_member_id) REFERENCES family_members (id)
);
