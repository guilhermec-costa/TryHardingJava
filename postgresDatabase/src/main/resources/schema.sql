drop table if exists users;
drop table if exists books;
drop table if exists authors;

create table users (
    id int generated always as identity,
    name varchar not null,
    age int not null,
    email varchar(60) not null,
    primary key(id)
);

create table authors (
    id int generated always as identity,
    name varchar not null,
    age int not null,
    constraint pk_authors primary key (id)
);

create table books (
    isbn text not null,
    title text not null,
    author_id int,
    constraint pk_books primary key (isbn),
    foreign key (author_id) references authors (id)
);
