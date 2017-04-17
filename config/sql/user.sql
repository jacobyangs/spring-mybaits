DROP TABLE IF EXISTS `user`;
create table user
(
   name               char(20) not null,
   password           char(5) not null,
   id                 INT(20) not null AUTO_INCREMENT,
   primary key (id)
);