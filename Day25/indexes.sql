create index deptIndex on employee(department);

show indexes from employee;

drop index deptIndex on employee;

create index desigIndex on employee(designation(4));

create table demoEmp(
eId int primary key,
name varchar(25),
designation varchar(25),
email varchar(30),
salary double);


show indexes from demoemp;

create unique index nameIndex on demoemp(name);

create index emailIndex on demoemp(email);

insert into demoemp
values(101,'AAAA','Executive','aaa@xyz.com',34000);

insert into demoemp
values(102,'BBBB',' Sr. Executive','bbb@xyz.com',45000);

insert into demoemp
values(103,'CCCC','Associatee','aaa@xyz.com',55000);

create index desigEmail on demoemp(designation,email);

alter table demoemp
alter index emailIndex invisible;

show indexes from demoemp;

create index salaryIndex on demoemp(salary) invisible;

alter table demoemp
alter index salaryIndex visible;

alter table demoemp
alter index nameIndex invisible;

show indexes from demoemp;

select * from demoemp;

insert into demoemp
values(104,'CCCC','Sr. Associatee','ccc@xyz.com',65000);

drop index salaryIndex on demoemp;

create index salaryIndex on demoemp(salary desc);