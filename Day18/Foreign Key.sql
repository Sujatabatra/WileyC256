create table department(
departmentId varchar(10) primary key,
departmentName varchar(30)
);

insert into department
values
('D001',"Purchase"),
('D002',"Marketing"),
('D003',"HR"),
('D004',"IT"),
('D005',"Sales");

/*
On Delete/Update : Cascade , Set NULL,No Action, Restrict
Cascade : if a row from the parent table is deleted or updated, the values of the matching rows in the child table automatically deleted or updated.
SET NULL:  if a row from the parent table is deleted or updated, the values of the foreign key column (or columns) in the child table are set to NULL.
RESTRICT:  if a row from the parent table has a matching row in the child table, MySQL rejects deleting or updating rows in the parent table.
NO ACTION: is the same as RESTRICT.
*/
create table if not exists emp(
employeeId int primary key,
employeeName varchar(25) not null,
designation varchar(25),
email varchar(25) unique,
departmentId varchar(10) , 
salary double,
constraint fk_key foreign key(departmentId)
references department(departmentId) on delete set null on update restrict
);

insert into emp
values(1,'AAAA','Manager','aaa@xyz.com','D001',155000),
(2,'BBBB','Executive','bbb@xyz.com','D002',18000),
(3,'CCCC','Associate','ccc@xyz.com','D001',55000),
(4,'DDDD','Sr. Manager','ddd@xyz.com','D003',255000),
(5,'EEEE','Deputy Manager','eee@xyz.com','D005',175000);

select * from emp;

select * from department;

delete from department
where departmentId="D005";
