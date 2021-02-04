drop database if exists brcc;
drop user 'brcc'@'%';
create database brcc default character set utf8mb4 collate utf8mb4_unicode_ci;
use brcc;
create user 'brcc'@'%' identified by 'brcc123456';
grant all privileges on brcc.* to 'brcc'@'%';
flush privileges;
