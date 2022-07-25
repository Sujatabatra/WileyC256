-- self join
SELECT 
    CONCAT(m.lastName, ', ', m.firstName) AS 'Manager',
    CONCAT(e.lastName, ', ', e.firstName) AS 'Direct report'
FROM
    employees e
INNER JOIN employees m ON 
    m.employeeNumber = e.managerId
ORDER BY 
    Manager;