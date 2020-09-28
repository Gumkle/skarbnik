
CREATE TABLE type (
    Type_id INTEGER PRIMARY KEY,
    Types VARCHAR(50)
);

CREATE TABLE category (
    Category_id INTEGER PRIMARY KEY,
    Name VARCHAR(50)
);

CREATE TABLE money (
    Money_id INTEGER PRIMARY KEY,
    Whole INTEGER,
    Rest INTEGER
);

CREATE TABLE transactions (
    Id INTEGER PRIMARY KEY,
    Type_id INTEGER REFERENCES type (type_id),
    Category_id INTEGER REFERENCES category (category_id),
    Money_id INTEGER REFERENCES money (money_id)
);


