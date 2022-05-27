CREATE TABLE cities
(
    id      UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    name    TEXT NOT NULL,
    country TEXT NOT NULL
);