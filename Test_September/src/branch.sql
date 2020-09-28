drop table branch;

CREATE TABLE branch (
b_no		VARCHAR2(3) primary key,
b_name		VARCHAR2(20) NOT NULL,
b_addr		VARCHAR2(60),
b_phone 	VARCHAR2(16),
b_assets	DECIMAL(13)
);