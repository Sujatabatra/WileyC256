select * from employee;

USE `wileyc256`;
DROP procedure IF EXISTS `giveIncrement`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `giveIncrement` (in id int)
BEGIN
declare desig varchar(30);
declare sal double;
declare incrementedSal double;

select designation,salary
into desig,sal
from employee
where employeeId=id;

case desig
when 'Manager' then
set incrementedSal=sal+.15*sal;
when 'Associate' then
set incrementedSal=sal+.10*sal;
when 'Clerk' then
set incrementedSal=sal+.8*sal;
else
set incrementedSal=sal;
end case;

update employee
set salary=incrementedSal
where employeeId=id;

select * from employee
where employeeId=id;
END$$

DELIMITER ;

call giveIncrement(101);