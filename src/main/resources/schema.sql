CREATE TABLE if not exists Registration(
	id int PRIMARY KEY,
	firstname VARCHAR( 50 ) NOT NULL,
    lastname VARCHAR( 50 ) NOT NULL,
    phone VARCHAR( 50 ) NOT NULL,
    email VARCHAR( 50 ) NOT NULL,
    city VARCHAR( 50 ) NOT NULL,
    state VARCHAR( 50 ) NOT NULL,
    zipcode VARCHAR( 50 ) NOT NULL
);

CREATE TABLE if not exists Login(
	id int PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL
);