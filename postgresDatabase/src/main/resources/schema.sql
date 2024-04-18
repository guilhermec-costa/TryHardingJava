drop table if exists "users";

create table users (
    id int generated always as identity,
    name varchar not null,
    age int not null,
    email varchar(60) not null,
    primary key(id)
)
