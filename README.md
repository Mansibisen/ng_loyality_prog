# ng_loyality_prog


create database amex_loyalty;
use amex_loyalty;

CREATE TABLE Customer (
    customer_id int NOT NULL AUTO_INCREMENT,
    name  varchar(255) NOT NULL,
    email  varchar(255) NOT NULL,
    phone_number  varchar(255) NOT NULL,
    credit_card_number  varchar(255) NOT NULL,
    age int NOT NULL,
    gender boolean NOT NULL,
    attrition_flag boolean NOT NULL,
    
    PRIMARY KEY (customer_id)
    
);

CREATE TABLE Transaction (
    trans_id int NOT NULL AUTO_INCREMENT,
    customer_id int NOT NULL,
    trans_date varchar(255) NOT NULL ,
    merchant_id varchar(255) NOT NULL ,
    merchant_name  varchar(255) NOT NULL,
    brand_name  varchar(255) NOT NULL,
    segment_name  varchar(255) NOT NULL,
    trans_amount BIGINT NOT NULL,
    loyalty_points_earned BIGINT NOT NULL,
    
    PRIMARY KEY (trans_id)
    
);

ALTER TABLE Customer
ADD COLUMN loyalty_points BIGINT NOT NULL;
