CREATE TABLE Transaction (
    id INT NOT NULL PRIMARY KEY,
);

CREATE TABLE Category (
    id INT NOT NULL PRIMARY KEY,
    TransactionId INT FOREIGN KEY REFERENCES Transaction(id),
    category VARCHAR(100)
);

CREATE TABLE Money (
    id INT NOT NULL PRIMARY KEY,
    TransactionId INT FOREIGN KEY REFERENCES Transaction(id),
    whole INT NOT NULL,
    decimal INT NOT NULL
);

CREATE TABLE Type (
    id INT NOT NULL PRIMARY KEY,
    TransactionId INT FOREIGN KEY REFERENCES Transaction(id),
    outflow
);

CREATE TABLE Date (
    id INT NOT NULL PRIMARY KEY,
    TransactionId INT FOREIGN KEY REFERENCES Transaction(id),
    Date DATE
);