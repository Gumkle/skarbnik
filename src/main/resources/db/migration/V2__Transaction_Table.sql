
CREATE TABLE type (
    Type_id SERIAL PRIMARY KEY,
    Types VARCHAR(50)
);

CREATE TABLE category (
    Category_id SERIAL PRIMARY KEY,
    Name VARCHAR(50)
);

CREATE TABLE money (
    Money_id SERIAL PRIMARY KEY,
    Whole INTEGER,
    Rest INTEGER
);

CREATE TABLE transactions (
    Id SERIAL PRIMARY KEY,
    Type_id INTEGER REFERENCES type (type_id),
    Category_id INTEGER REFERENCES category (category_id),
    Money_id INTEGER REFERENCES money (money_id)
);


