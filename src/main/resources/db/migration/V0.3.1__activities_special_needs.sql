CREATE TABLE activities_special_needs
(
    id              UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    activity_id     UUID    NOT NULL,
    special_need_id INTEGER NOT NULL,
    CONSTRAINT fk_activities_special_needs_activity_id FOREIGN KEY (activity_id) REFERENCES activities (id),
    CONSTRAINT fk_activities_special_needs_special_need_id FOREIGN KEY (special_need_id) REFERENCES special_needs (id)
);