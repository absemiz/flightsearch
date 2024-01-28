CREATE TABLE Flight (
    id INT AUTO_INCREMENT PRIMARY KEY,
    departure_city VARCHAR(255),
    arrival_city VARCHAR(255),
    departure_date DATETIME,
    return_date DATETIME,
    price DOUBLE
);

