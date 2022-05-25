CREATE TABLE cities
(
    id      UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    city    TEXT NOT NULL,
    country TEXT NOT NULL
);