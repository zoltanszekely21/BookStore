DROP TABLE t_book IF EXISTS;

create table t_book
(
	id integer auto_increment,
	title varchar(50),
	author varchar(50),
	yearPublished varchar (50),
	price integer,
	primary key(id)
);

DROP TABLE t_bestsellers IF EXISTS;
create table t_bestsellers
(
	id integer auto_increment,
	bestsellers_code varchar(10),
	bestsellers_name varchar(50)
);
