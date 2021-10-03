CREATE TABLE Customers (
    CustomerID INTEGER (6) NOT NULL PRIMARY KEY,
    FirstName VARCHAR(200) NOT NULL,
    LastName VARCHAR(200) NOT NULL,
    Email VARCHAR(200),
    Address VARCHAR(200),
    City VARCHAR(200),
    State CHAR(2),
    Phone VARCHAR(20) NOT NULL,
    Birthday DATE,
    FavouriteDish INTEGER(6) REFERENCES Dishes(DishID)
);

SELECT * FROM Customers;

SELECT * FROM Dishes;

SELECT Name FROM Dishes;

SELECT FirstName, LastName, Email FROM Customers;

SELECT FirstName, LastName, Email, State FROM Customers WHERE State='CA' OR State='CO';

-- first symbol is C, second is any
SELECT FirstName, LastName, Email, State FROM Customers WHERE State LIKE 'C%';

SELECT CustomerID, LastName, Email, State FROM Customers WHERE FirstName='Taylor';

SELECT * FROM Reservations;

SELECT * FROM Reservations WHERE Date > '2019-02-06' AND Date < '2019-02-07';

-- sorting in alphabetical order by name. To sort in reverse order use DESC
SELECT * FROM Dishes ORDER BY Name;
SELECT * FROM Dishes ORDER BY Name DESC;
SELECT * FROM Dishes ORDER BY Price DESC;
SELECT * FROM Reservations ORDER BY Date DESC;

SELECT * FROM Reservations
WHERE Date > '2019-02-06' AND Date < '2019-02-07'
ORDER BY Date DESC;

SELECT COUNT(FirstName) FROM Customers;

SELECT  COUNT(FirstName) FROM Customers
WHERE State='CA';

SELECT SUM(Price), AVG(Price), MIN(Price), MAX(Price) FROM Dishes;

SELECT FirstName, LastName, FavoriteDish, Dishes.Name FROM Customers
JOIN Dishes ON Customers.FavoriteDish=Dishes.DishID;

SELECT FirstName, LastName, Reservations.Date, Reservations.PartySize
FROM Customers
Join Reservations ON Customers.CustomerID=Reservations.CustomerID
ORDER BY Reservations.Date;

SELECT OrdersDishes.OrderID, Orders.OrderDate, Customers.FirstName,
Customers.LastName, Customers.Phone, GROUP_CONCAT(Dishes.Name, ', ') AS Items,
COUNT(OrdersDishes.DishID) AS Qty,
SUM(Dishes.Price) AS Total
FROM OrdersDishes
Join Dishes ON OrdersDishes.DishID=Dishes.DishID
Join Orders ON Orders.OrderID=OrdersDishes.OrderID
Join Customers ON Orders.CustomerID=Customers.CustomerID
GROUP BY (Orders.OrderID);

-- modifying data

SELECT * FROM Customers;

INSERT INTO Customers(FirstName, LastName, Email,Phone)
VALUES ('Jane', 'Smith', 'jsmith2019@landonhotel.com', '415-555-1234');

SELECT * FROM Customers
WHERE Email='jsmith2019@landonhotel.com';

SELECT * FROM Customers;

INSERT INTO Customers(CustomerID,  FirstName, LastName, Email,Phone)
VALUES (101, 'Jane2', 'Smith2', 'jsmith2019@landonhotel.com2', '415-555-12342');

DELETE FROM Customers
WHERE CustomerID='101';

DELETE FROM Customers
WHERE Email='jsmith2019@landonhotel.com';

INSERT INTO Customers(CustomerID,  FirstName, LastName, Email,Phone)
VALUES (101, 'Jane', 'Smith', 'jsmith2019@landonhotel.com', '415-555-1234');

SELECT * FROM Customers WHERE FirstName='Taylor' AND LastName='Jenkins';

SELECT * FROM Customers WHERE CustomerID=4;

UPDATE Customers SET Email = 'tjenkins@landonhotel.com' WHERE CustomerID=4;