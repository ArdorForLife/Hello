drop table student;

create table student (
	user_id  varchar2(10) primary key,
	user_pwd varchar2(10),
	name     varchar2(20),
	address  varchar2(50),
	age      number(5)
	);

 select * from student;
 
 insert into student(user_id, user_pwd, name, age)
 	values('hong','111','ȫ�浿',18);
 insert into student(user_id, user_pwd, name, age)
 	values('hongja','222','ȫ����',20);
 insert into student
 	values('lee','333','�̱���','�뱸','30');