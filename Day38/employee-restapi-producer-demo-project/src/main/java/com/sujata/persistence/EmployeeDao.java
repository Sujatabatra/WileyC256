package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
