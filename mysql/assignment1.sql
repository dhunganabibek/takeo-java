-- creating database
CREATE DATABASE bootcamp;


-- using bootcamp database
use bootcamp;

-- CREATING A TABLE CUSTOMERS
CREATE TABLE CUSTOMERS(
	Name VARCHAR(25),
    PhoneNumber INT,
    City VARCHAR(25),
    Address VARCHAR(25),
    PostalCode INT
);

-- decribing the table customers
desc CUSTOMERS;


-- insert data into database
INSERT INTO CUSTOMERS (Name,PhoneNumber, City,Address,PostalCode) VALUES ("Bibek",832306869,"Lubbock", "1234 Avenue", 79401);


-- alter command to add column 
ALTER TABLE CUSTOMERS add column CustomerId VARCHAR(25);

-- getting  all information from the table
SELECT * FROM CUSTOMERS;


-- update table information
UPDATE CUSTOMERS SET NAME="Jack" where NAME="Bibek";

-- safe mode: prevent changing data in SQL databse without primary key.


