CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);
INSERT INTO category (name, description, image_url, is_active)VALUES('Laptop','This is mine','CAT_1.png');

CREATE TABLE user_detail(

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	
	CONSTRAINT pk_user_id PRIMARY KEY (id)

);
INSERT INTO user_detail (first_name, last_name, role, enabled, password, email, contact_number)
VALUES('Gabriel','Mangenge','ADMIN', 'true', 'admin','gaby@gmail.com','888888888');

CREATE TABLE product(

	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT default 0,
	views INT default 0,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id)REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id)REFERENCES user_detail (id),

);
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id,purchases,views)
VALUES('AFS066MC','Auris','CAR', 'Car from Japan', 32000,2,true,1,3,0,0);
