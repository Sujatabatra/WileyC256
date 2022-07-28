USE `wileyc256`;
DROP procedure IF EXISTS `repeatDemo`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `repeatDemo` ()
BEGIN
declare counter int default 1;
declare str varchar(50);

set str="";

repeat
 set str=concat(str,counter," ");
 set counter=counter+1;
 until counter>=10
 end repeat;
 
 select str "output";

END$$

DELIMITER ;


call repeatDemo();