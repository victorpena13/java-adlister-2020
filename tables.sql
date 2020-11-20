use listcraig_db;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id int unsigned not null auto_increment primary key,
    name varchar(20),
    email varchar(75),
    password varchar(20)
);

CREATE TABLE categories (
    id int unsigned not null auto_increment,
    name varchar(20)
);

CREATE TABLE ads (
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(500),
    description text,
    primary key (id),
    foreign key (user_id) references users(id),
    category_id INT UNSIGNED DEFAULT NULL,
    primary key (id),
    foreign key (category_id) REFERENCES categories (id)
);



