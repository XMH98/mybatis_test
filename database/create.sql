drop database if exists mybatis;
create database mybatis charset utf8;
use mybatis;
create table t_user(
    id int primary key auto_increment,
    username varchar(50) unique not null ,
    password varchar(100),
    phone varchar(30),
    address varchar(100)
)charset utf8;