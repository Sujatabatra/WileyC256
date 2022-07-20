create table if not exists employee(
employeeId int primary key,
employeeName varchar(25) not null,
designation varchar(25),
email varchar(25) unique,
department varchar(30) default 'Sales',
salary double
);

insert into employee(employeeId,designation,employeeName,department,email,salary)
values(101,'Associate','AAAA','IT','aa@xyz.com',45000);


select * from employee;

insert into employee
values(102,'BBB','Manager','bbb@mno.com','IT',125000);

insert into employee(employeeId,designation,employeeName,email,salary)
values(103,'Sr. Associate','CCCC','ccc@xyz.com',65000);

insert into employee(employeeId,employeeName,email,salary)
values(104,'DDDD','ddd@xyz.com',58000);

insert into employee(employeeId,designation,employeeName,department,email,salary)
values(105,'Executive','EEEE',null,'eee@xyz.com',15000);

insert into employee
values(106,'FFF','Manager',null,'Sales',145000);

select * from employee;

insert into employee
values
(107,'GGGG','Sr. Manager','ggg@mno.com','IT',267000),
(108,'HHHH','Sr. Associate','hhh@mno.com','HR',67000),
(109,'IIII','Sr. Executive','iii@mno.com','HR',37000);


insert ignore into employee
values
(107,'LLLL','Sr. Manager','ggg@mno.com','IT',267000),
(110,'JJJJ','Associate','jjj@mno.com','Sales',82000),
(111,'KKKK','Sr. Director','kkk@mno.com','IT',537000);