CREATE TABLE special_needs
(
    id           SERIAL PRIMARY KEY,
    special_need TEXT NOT NULL UNIQUE
);