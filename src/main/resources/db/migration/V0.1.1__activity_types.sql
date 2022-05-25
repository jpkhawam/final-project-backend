CREATE TABLE activity_types
(
    id            SERIAL PRIMARY KEY,
    activity_type TEXT NOT NULL UNIQUE
);