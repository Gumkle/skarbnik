CREATE TABLE type (
    id SERIAL NOT NULL,
    name VARCHAR(50),
    PRIMARY KEY (id, name),
    UNIQUE (name)
);

CREATE TABLE category (
    id SERIAL NOT NULL,
    category VARCHAR(50),
    PRIMARY KEY (id, category),
    UNIQUE (category)
);

CREATE TABLE money (
    id SERIAL NOT NULL,
    whole INTEGER UNIQUE,
    rest INTEGER UNIQUE,
    PRIMARY KEY (id, whole, rest),
    UNIQUE (whole, rest)
);

CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) REFERENCES type (name),
    category VARCHAR(50) REFERENCES category (category),
    whole INTEGER REFERENCES money (whole),
    rest INTEGER REFERENCES money (rest),
    created DATE NOT NULL
);