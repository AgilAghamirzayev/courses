CREATE TABLE student
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(32),
    surname     VARCHAR(32),
    age         INT,
    course      VARCHAR(32),
    mark        NUMERIC(4, 2),
    birth_place TEXT,
    created_at  TIMESTAMP
);

ALTER TABLE student
    ADD COLUMN mail VARCHAR(32);

ALTER TABLE student
    RENAME COLUMN mail TO email;

ALTER TABLE student
    DROP COLUMN email;

COMMENT ON TABLE student is 'This table store student information';
COMMENT ON COLUMN student.name is 'Name of student ex: Ali';

TRUNCATE TABLE student;
DROP TABLE student;

INSERT INTO student (name, course, mark)
VALUES ('John', 'Computer Science', 84.5);

INSERT INTO student (name, surname, age, course, mark, birth_place, created_at)
VALUES ('John', 'Doe', 20, 'Mathematics', 85.5, 'New York', CURRENT_TIMESTAMP),
       ('Jane', 'Smith', 22, 'Computer Science', 88.2, 'London', CURRENT_TIMESTAMP),
       ('Michael', 'Johnson', 19, 'Chemistry', 91.8, 'Los Angeles', CURRENT_TIMESTAMP),
       ('Emily', 'Brown', 21, 'Biology', 79.9, 'Sydney', CURRENT_TIMESTAMP),
       ('David', 'Wilson', 23, 'Computer Science', 88.1, 'Toronto', CURRENT_TIMESTAMP),
       ('Sarah', 'Anderson', 20, 'History', 75.6, 'Paris', CURRENT_TIMESTAMP),
       ('Daniel', 'Taylor', 22, 'English Literature', 82.3, 'Berlin', CURRENT_TIMESTAMP),
       ('Olivia', 'Martinez', 23, 'Sociology', 89.7, 'Madrid', CURRENT_TIMESTAMP),
       ('Jacob', 'Garcia', 21, 'Computer Science', 99.4, 'Rome', CURRENT_TIMESTAMP),
       ('Sophia', 'Lopez', 23, 'Sociology', 84.6, 'Tokyo', CURRENT_TIMESTAMP);

UPDATE student
SET mark = 95.7
WHERE id = 1;

UPDATE student
SET mark       = 70,
    created_at = CURRENT_TIMESTAMP
WHERE course = 'Computer Science'
  AND mark < 70;

DELETE
FROM student
WHERE id = 2;

DELETE
FROM student
WHERE name ISNULL;


--------------------------------------------------------------------------------------------------------------------------------------------
-- SELECTS
--------------------------------------------------------------------------------------------------------------------------------------------

SELECT *
FROM student;

SELECT name, age, course
FROM student;

SELECT name, age, course
FROM student
WHERE age > 20;

SELECT name, age, course
FROM student
WHERE age > 20
   or name = 'John';

SELECT name, course, mark
FROM student
WHERE mark BETWEEN 80 and 90;


SELECT name, course, mark
FROM student
WHERE mark BETWEEN 80 and 90
  AND course = 'Computer Science';

SELECT name, course, mark
FROM student
WHERE course IN ('Computer Science', 'Sociology', 'History');

SELECT name, course, mark
FROM student
WHERE course NOT IN ('Computer Science', 'Sociology', 'History');

SELECT *
FROM student
WHERE name LIKE 'S%';

SELECT *
FROM student
WHERE name LIKE '%a';

SELECT *
FROM student
WHERE name LIKE '%al%';

SELECT name, age, course
FROM student
ORDER BY age DESC;

SELECT name, age, course
FROM student
ORDER BY age DESC
LIMIT 1;

SELECT DISTINCT course
FROM student;

SELECT course, COUNT(*)
FROM student
GROUP BY course
HAVING COUNT(*) > 1;

SELECT course, AVG(mark) AS average_mark
FROM student
WHERE age > 20
  AND mark > 80
GROUP BY course
ORDER BY average_mark DESC;

--------------------------------------------------------------------------------------------------------------------------------------------
-- AGREGAT FUNCS
--------------------------------------------------------------------------------------------------------------------------------------------


CREATE TABLE sales
(
    id           SERIAL PRIMARY KEY,
    product_name VARCHAR(50),
    category     VARCHAR(50),
    quantity     INT,
    price        DECIMAL(10, 2),
    sale_date    DATE
);

INSERT INTO sales (product_name, category, quantity, price, sale_date)
VALUES ('Laptop', 'Electronics', 5, 1000.00, '2024-12-01'),
       ('Smartphone', 'Electronics', 10, 500.00, '2024-12-02'),
       ('Headphones', 'Accessories', 15, 50.00, '2024-12-03'),
       ('Keyboard', 'Accessories', 8, 25.00, '2024-12-04'),
       ('Mouse', 'Accessories', 12, 20.00, '2024-12-05'),
       ('Tablet', 'Electronics', 7, 300.00, '2024-12-06');

SELECT SUM(quantity * price) AS total_revenue
FROM sales;

SELECT AVG(price) AS average_price
FROM sales;

SELECT COUNT(*) AS total_sales
FROM sales;

SELECT MAX(price) AS max_price, MIN(price) AS min_price
FROM sales;

SELECT category, SUM(quantity * price) AS category_revenue
FROM sales
GROUP BY category;

SELECT category, SUM(quantity * price) AS category_revenue
FROM sales
GROUP BY category
HAVING SUM(quantity * price) > 2000;

SELECT STRING_AGG(product_name, ', ') AS all_products
FROM sales;

--------------------------------------------------------------------------------------------------------------------------------------------
-- TRANSACTIONS
--------------------------------------------------------------------------------------------------------------------------------------------

BEGIN;

UPDATE student
SET mark = 90
WHERE id = 1;

SAVEPOINT updated_student_mark;

DELETE
FROM student
WHERE age < 18;

SAVEPOINT deleted_student;

INSERT INTO student (name, surname, age, course)
VALUES ('Alice', 'Smith', 22, 'English');

UPDATE student
SET mark = 85
WHERE course = 'Mathematics';

SAVEPOINT inserted_and_updated_student;

ROLLBACK TO deleted_student;

COMMIT;


--------------------------------------------------------------------------------------------------------------------------------------------
-- JOINS
--------------------------------------------------------------------------------------------------------------------------------------------


-- Create Customers Table
CREATE TABLE customers
(
    customer_id   SERIAL PRIMARY KEY,
    customer_name VARCHAR(100),
    city          VARCHAR(50)
);

-- Create Orders Table
CREATE TABLE orders
(
    order_id     SERIAL PRIMARY KEY,
    customer_id  INT REFERENCES customers (customer_id),
    product_name VARCHAR(50),
    quantity     INT,
    total_price  DECIMAL(10, 2),
    order_date   DATE
);

-- Insert Data into Customers
INSERT INTO customers (customer_name, city)
VALUES ('Alice', 'New York'),
       ('Bob', 'Los Angeles'),
       ('Charlie', 'Chicago'),
       ('Diana', 'Houston');

-- Insert Data into Orders
INSERT INTO orders (customer_id, product_name, quantity, total_price, order_date)
VALUES (1, 'Laptop', 1, 1220, '2024-12-01'),
       (2, 'Smartphone', 2, 1200, '2024-12-02'),
       (1, 'Tablet', 1, 860, '2024-12-03'),
       (3, 'Headphones', 4, 330, '2024-12-04');


SELECT c.customer_name, o.product_name, o.quantity, o.order_date
FROM customers c,
     orders o
WHERE c.customer_id = o.customer_id;


SELECT c.customer_name, o.product_name, o.quantity, o.order_date
FROM customers c
         INNER JOIN orders o ON c.customer_id = o.customer_id;

SELECT c.customer_name, o.product_name, o.quantity, o.order_date
FROM customers c
         LEFT JOIN orders o ON c.customer_id = o.customer_id;

SELECT c.customer_name, o.product_name, o.quantity, o.order_date
FROM customers c
         RIGHT JOIN orders o ON c.customer_id = o.customer_id;

SELECT c.customer_name, o.product_name, o.quantity, o.order_date
FROM customers c
         FULL OUTER JOIN orders o ON c.customer_id = o.customer_id;

SELECT c.customer_name, o.product_name
FROM customers c
         CROSS JOIN orders o;


--------------------------------------------------------------------------------------------------------------------------------------------
-- PLSQL
--------------------------------------------------------------------------------------------------------------------------------------------

DROP FUNCTION CALCULATE_TOTAL_REVENUE;

CREATE OR REPLACE FUNCTION calculate_total_revenue(p_customer_id INT)
    RETURNS DECIMAL(10, 2) AS $$
DECLARE
    total_revenue DECIMAL(10, 2);
BEGIN
    SELECT SUM(quantity * total_price)
    INTO total_revenue
    FROM orders
    WHERE customer_id = p_customer_id;

    RETURN COALESCE(total_revenue, 0);
END;
$$ LANGUAGE plpgsql;

SELECT calculate_total_revenue(1);

---------------------------------------------------------------------------------------------------------------

-- Create Log Table
CREATE TABLE order_logs (
                            log_id SERIAL PRIMARY KEY,
                            log_message TEXT,
                            log_date TIMESTAMP
);

CREATE OR REPLACE PROCEDURE insert_order(
    p_customer_id INT,
    p_product_name VARCHAR,
    p_quantity INT,
    p_total_price DECIMAL(10, 2),
    p_order_date DATE
)
    LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO orders (customer_id, product_name, quantity, total_price, order_date)
    VALUES (p_customer_id, p_product_name, p_quantity, p_total_price, p_order_date);

    INSERT INTO order_logs (log_message, log_date)
    VALUES (CONCAT('Order inserted for customer ID: ', p_customer_id), CURRENT_TIMESTAMP);
END;
$$;

CALL insert_order(1, 'Tablet', 2, 600.00, '2024-12-05');


---------------------------------------------------------------------------------------------------------------

CREATE OR REPLACE FUNCTION update_customer_timestamp()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.created_at = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER customer_update_trigger
    BEFORE UPDATE ON customers
    FOR EACH ROW
EXECUTE FUNCTION update_customer_timestamp();

UPDATE customers
SET city = 'San Francisco'
WHERE customer_id = 1;

SELECT * FROM customers;

---------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW customer_order_summary AS
SELECT
    c.customer_id,
    c.customer_name,
    COUNT(o.order_id) AS total_orders,
    SUM(o.total_price) AS total_revenue
FROM customers c
         LEFT JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.customer_name;

SELECT * FROM customer_order_summary;