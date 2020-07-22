DROP TABLE t_book IF EXISTS;

create table t_book
(
	id integer auto_increment,
	title varchar(50),
	author varchar(50),
	yearPublished varchar(50),
	price integer,
	primary key(id),
);

