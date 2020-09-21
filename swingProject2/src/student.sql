drop table student;

create table student(
	no number(20) primary key,
	hak number(20) not null,
	name varchar2(20) not null,
	kor number(10),
	mat number(10),
	eng number(10)
);

create sequence no_seq increment by 1 start with 1
 nocycle;

insert into student (no,hak,name,kor,mat,eng) values(no_seq.nextval, 1001, 'ȫ�浿', 100, 100, 100);
 
select * from student;