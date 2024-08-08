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

INSERT INTO product (name)
VALUES
('Кеды №1', 'Кеды', 'Кожа', 'Luma', 'Описание балдёжных кед', 5399),
('Кроссовки №1', 'Кроссовки', 'Кожа', 'Luma', 'Кроссовки для самых требовательных', 3999),
('Кроссовки №2', 'Кроссовки', 'Замша', 'Mike', 'Зимние утеплённые кроссовки', 7878),
('Ботинки', 'Кожаные ботинки', 'Кожа', 'ELCO', 'Кожаная кожанность', 3299),
('Пуховик уровня А', 'Пуховик', 'Полиэстер', 'Devi''s', 'Пуховик из стеганного текстиля', 6669),
('Кожанка из прошлого', 'Куртка', 'Кожа', 'Kango', 'Кожаная куртка с некогда популярным кроем', 2999),
('Пальто с капюшоном', 'Пальто', 'Шерсть', 'Kango', 'Шерстяное пальто с капюшоном', 9999),
('Футболка №1', 'Футболка', 'Хлопок', 'Lowman', 'Кто-нибудь это вообще читает?', 759),
('Футболка №2', 'Футболка', 'Хлопок', 'Luma', 'Футболка с принтом Большой волны в Канагаве', 1149),
('Футболка белая', 'Футболка', 'Хлопок', 'Kango', 'Обычная белая футболка', 700),
('Зонт складной', 'Акссесуар', 'Полиэстер', 'Kango', 'Надёжный складной зонт; любому тирану будет под стать', 499),
('Галстук', 'Акссесуар', 'Хлопок', 'Lenderson', 'Синий галстук с узорами-птицами', 2295);