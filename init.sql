CREATE DATABASE IF NOT EXISTS chilifruits;
USE chilifruits;

CREATE TABLE chili_fruits (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    origin VARCHAR(100),
    quantity int,
    scoville int,
    unit_price float
);

INSERT INTO chili_fruits (name, origin, quantity, scoville, unit_price) VALUES
    ('Lombardo', 'Italien', 30, 2000, 4),
    ('Bhut Jolokia', 'Indien', 100, 800000, 20),
    ('Aji Charapita', 'Peru', 20, 40000, 50);
