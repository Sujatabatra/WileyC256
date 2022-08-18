package com.sujata.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeesResource(){
		return employeeService.getAllEmployees();
	}
	
	
	@GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("id") int id) {
		Optional<Employee> opEmployee=employeeService.searchEmployeeByID(id);
		Employee employee=opEmployee.orElse(new Employee());
		return employee;
	}
}
