create table if not exists users
(id integer not null,
 user_name TEXT not null,
 primary key (id));

insert into users values (1, 'shaikezam');