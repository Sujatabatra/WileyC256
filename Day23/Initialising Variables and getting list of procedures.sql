USE `wileyc256`;
DROP procedure IF EXISTS `variableDemo`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `variableDemo` ()
BEGIN

declare value int default 10;
declare name varchar(30) default 'XYZ';

show procedure status;
select value,name;
END$$

DELIMITER ;

call variableDemo();

show procedure status ;

show procedure status 
where Db="wileyc256";