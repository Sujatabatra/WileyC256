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