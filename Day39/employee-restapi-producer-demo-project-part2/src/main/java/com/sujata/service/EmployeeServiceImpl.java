package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Optional<Employee> searchEmployeeByID(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Optional<Employee> empOptional=employeeDao.findById(id);
		if(empOptional.isPresent()) {
			employeeDao.deleteById(id);
			return empOptional.get();
		}
		return new Employee();
	}

	@Override
	public Employee updateSalary(int id, double sal) {
		int rows=employeeDao.updateEmployeeSalary(id, sal);
		if(rows>0) {
			return employeeDao.findById(id).get();
		}
		return new Employee();
	}

}
