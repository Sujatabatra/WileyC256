USE `wileyc256`;
DROP procedure IF EXISTS `getEmployeeByID`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`getEmployeeByID`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEmployeeByID`(in id int)
BEGIN
declare na varchar(25);
select employeeName into na 
from employee
where employeeId=id;

if name is null then
Signal SQLState '45000'
set message_text="Id does not exist";
else
select name;
end if;

END$$

DELIMITER ;
;

call getEmployeeByID(102);
call getEmployeeByID(1089);