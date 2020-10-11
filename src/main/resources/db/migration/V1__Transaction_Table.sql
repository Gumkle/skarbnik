CREATE TABLE type (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE category (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE money (
    id SERIAL PRIMARY KEY,
    whole INTEGER,
    rest INTEGER
);

CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    type INTEGER REFERENCES type (id),
    category INTEGER REFERENCES category (id),
    money INTEGER REFERENCES money (id),
    created DATE
);