USE `wileyc256`;
DROP procedure IF EXISTS `searchEmployeeByID`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `searchEmployeeByID` (IN id int)
BEGIN

select * from employee where employeeId=id;

END$$

DELIMITER ;

call searchEmployeeByID(101);


USE `wileyc256`;
DROP procedure IF EXISTS `getEmployeeSalaryDetails`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`getEmployeeSalaryDetails`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEmployeeSalaryDetails`(IN id int)
BEGIN
declare sal double;
declare hr double;
declare da double;
declare pf double;
declare total double;
declare name varchar(20);

select employeeName,salary,.15*salary,.18*sal,.12*salary
into name,sal,hr,da,pf
from employee
where employeeId=id;

set total=sal+hr+da-pf;

select name as "Employee Name",sal as salary,hr,da,pf,total as "Total Salary";

END$$

DELIMITER ;
;

call getEmployeeSalaryDetails(103);