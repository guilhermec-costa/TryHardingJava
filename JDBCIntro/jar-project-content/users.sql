create table if not exists users (
    id identity primary key,
    name varchar(255) not null
);

truncate table users;

insert into users (name) values ('Churros');
