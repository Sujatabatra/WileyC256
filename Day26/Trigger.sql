create table salaryUpdateLog(
employeeId int,
modificationTime datetime default current_timestamp,
oldSalary double,
newSalary double);

DELIMITER //
CREATE TRIGGER SalaryUpdate
BEFORE UPDATE ON employee FOR EACH ROW 
BEGIN
    IF NEW.salary <> OLD.salary THEN 
		INSERT INTO salaryUpdateLog(employeeId,oldsalary,newsalary) 
        VALUES(NEW.employeeId,OLD.salary,NEW.salary);
	END IF;
END//
DELIMITER ;

drop trigger SalaryUpdate;

select * from employee;

update employee 
set salary=64000
where employeeId=104;

select * from salaryUpdateLog;