package com.sujata.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE Employee SET salary=:sal where employeeId=:id")
	int updateEmployeeSalary(@Param("id") int id,@Param("sal") double salary);

}
