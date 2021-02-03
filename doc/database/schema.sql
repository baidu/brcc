drop database if exists new_rcc;
drop user if exists 'new_rcc'@'%';
create database new_rcc default character set utf8mb4 collate utf8mb4_unicode_ci;
use new_rcc;
create user 'new_rcc'@'%' identified by 'rcc123456';
grant all privileges on new_rcc.* to 'new_rcc'@'%';
flush privileges;
