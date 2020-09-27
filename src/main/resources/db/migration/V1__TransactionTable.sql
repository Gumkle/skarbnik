CREATE TABLE Transaction (
    id INT NOT NULL PRIMARY KEY,
    type INT FOREIGN KEY REFERENCES (type_id)
    category INT FOREIGN KEY REFERENCES (category_id)
    money INT FOREIGN KEY REFERENCES (money_id)
)

CREATE TABLE Type (
    type_id INT NOT NULL PRIMARY KEY
)

CREATE TABLE Category (
    category_id IN NOT NULL PRIMARY KEY,
    name VARCHAR(50)
)

CREATE TABLE Money (
    money_id INT NOT NULL PRIMARY KEY,
    amount DOUBLE
)


