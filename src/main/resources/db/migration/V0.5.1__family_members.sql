CREATE TABLE family_members
(
    id        UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    family_id UUID NOT NULL,
    name      TEXT NOT NULL,
    age       INTEGER CHECK ( age > 0 AND age <= 100),
    CONSTRAINT fk_family_members_family_id FOREIGN KEY (family_id) REFERENCES families (id)
);
