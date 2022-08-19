package com.sujata.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.bean.Employees;
import com.sujata.persistence.EmployeeDao;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employees getAllEmployeesResource(){
		return new Employees(employeeService.getAllEmployees());
	}
	
	
//	@GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public Employee getEmployeeByIdResource(@PathVariable("id") int id) {
//		Optional<Employee> opEmployee=employeeService.searchEmployeeByID(id);
//		Employee employee=opEmployee.orElse(new Employee());
//		return employee;
//	}
	
	@GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeByIdResource(@PathVariable("id") int id) {
		Optional<Employee> opEmployee=employeeService.searchEmployeeByID(id);
		if(opEmployee.isPresent()) {
			return new ResponseEntity<Employee>(opEmployee.get(), HttpStatus.FOUND);
		}
			
		return new ResponseEntity<Employee>(new Employee(), HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployeeResource(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee deleteEmployeeResource(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping(path = "/employees/{id}/{sal}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployeeSalaryResource(@PathVariable("id") int id,@PathVariable("sal") double salary) {
		return employeeService.updateSalary(id, salary);
	}
}
