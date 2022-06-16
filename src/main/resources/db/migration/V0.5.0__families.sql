CREATE TABLE families
(
    id          UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    email       TEXT NOT NULL,
    family_name TEXT NOT NULL,
    city_id     UUID,
    CONSTRAINT fk_families_city_id FOREIGN KEY (city_id) REFERENCES cities (id)
);
