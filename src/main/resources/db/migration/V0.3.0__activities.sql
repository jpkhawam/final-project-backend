CREATE TABLE activities
(
    id               UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    name             TEXT    NOT NULL,
    category_id      INTEGER NOT NULL,
    activity_type_id INTEGER NOT NULL,
    city_id          UUID    NOT NULL,
    setting_id       INTEGER NOT NULL,
    coordinates      TEXT    NOT NULL,
    gmaps_link       TEXT,
    min_age          INTEGER CHECK (min_age > 0 AND min_age <= 100),
    max_age          INTEGER CHECK (max_age > 0 AND max_age <= 100),
    energy_level     INTEGER CHECK (energy_level > 0 AND energy_level <= 5),
    budget           INTEGER,
    pets_allowed     BOOLEAN,
    contact_number   TEXT,
    CONSTRAINT fk_activities_category_id FOREIGN KEY (category_id) REFERENCES categories (id),
    CONSTRAINT fk_activities_activity_type_id FOREIGN KEY (activity_type_id) REFERENCES activity_types (id),
    CONSTRAINT fk_activities_city_id FOREIGN KEY (city_id) REFERENCES cities (id),
    CONSTRAINT fk_activities_setting_id FOREIGN KEY (setting_id) REFERENCES settings (id)
);