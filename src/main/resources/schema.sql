CREATE SCHEMA technicalTest

    CREATE SEQUENCE IF NOT EXISTS technicalTest.car_id_pkey_seq;
CREATE TABLE technicalTest.car
(
    car_id int8 NOT NULL DEFAULT nextval('technicalTest.car_id_pkey_seq'::regclass),
    car_name varchar(100) NOT NULL,
    brand_id int8 NOT NULL,
    CONSTRAINT pk_car_car_id PRIMARY KEY (car_id),
    CONSTRAINT pk_car_car_name UNIQUE (car_name, brand_id)
);

CREATE SEQUENCE IF NOT EXISTS technicalTest.brand_id_pkey_seq;
CREATE TABLE technicalTest.brand
(
    brand_id int8 NOT NULL DEFAULT nextval('technicalTest.brand_id_pkey_seq'::regclass),
    brand_name varchar(100) NOT NULL,
    CONSTRAINT pk_brand_brand_id PRIMARY KEY (brand_id),
    CONSTRAINT pk_brand_brand_name UNIQUE (brand_name)
);