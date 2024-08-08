create table order(
order_id identity primary key,
product_id varchar(100),
status varchar(100)
)

create table product(
product_id identity primary key,
name varchar(200)
)

create table warehouse(
product_id varchar(100),
quantity int
)

ALTER TABLE warehouse ADD FOREIGN KEY (product_id) REFERENCES product (product_id) ON DELETE CASCADE;
ALTER TABLE order ADD FOREIGN KEY (product_id) REFERENCES product (product_id) ON DELETE CASCADE


INSERT INTO product (name)
VALUES
('TestProduct1'),
('TestProduct2'),
('TestProduct3');

INSERT INTO warehouse (product_id, quantity)
VALUES
(SELECT product_id FROM product WHERE name = 'TestProduct1', 10),
(SELECT product_id FROM product WHERE name = 'TestProduct2', 4),
(SELECT product_id FROM product WHERE name = 'TestProduct3', 0),