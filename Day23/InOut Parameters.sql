USE `wileyc256`;
DROP procedure IF EXISTS `getCounter`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `getCounter` (inout counter int,in increment int)
BEGIN

set counter=counter+increment;

END$$

DELIMITER ;

set @counter=10;
call getCounter(@counter,5);
select @counter;