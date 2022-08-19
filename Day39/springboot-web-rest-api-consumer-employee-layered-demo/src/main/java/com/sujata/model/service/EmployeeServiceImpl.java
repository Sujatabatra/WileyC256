package com.sujata.model.service;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.bean.Employees;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		Employees employees = restTemplate.getForObject("http://localhost:8082/employees", Employees.class);
		return employees.getEmployees();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		try {
			ResponseEntity<Employee> responseEmployee = restTemplate
					.getForEntity("http://localhost:8082/employees/" + employeeId, Employee.class);
			Employee employee = null;

			employee = responseEmployee.getBody();
			return employee;
		} catch (HttpClientErrorException e) {
			return null;
		}

	}

	/*
	 * HR= 15% of Basic DA= 18% of Basic PF= 12% of Basic
	 */
	@Override
	public EmployeePayslip generatePayslip(int employeeId) {
		Employee employee = searchEmployeeById(employeeId);
		EmployeePayslip employeePayslip = null;
		if (employee != null) {
			double hr = .15 * employee.getSalary();
			double da = .18 * employee.getSalary();
			double pf = .12 * employee.getSalary();
			double total = employee.getSalary() + hr + da - pf;
			employeePayslip = new EmployeePayslip(employee, hr, pf, da, total);
		}
		return employeePayslip;

	}

	@Override
	public boolean addEmployee(Employee employee) {
		Employee emp = restTemplate.postForObject("http://localhost:8082/employees", employee, Employee.class);
		return true;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		Employee employee = restTemplate
				.exchange("http://localhost:8082/employees/" + employeeId, HttpMethod.DELETE, entity, Employee.class)
				.getBody();
		if (employee.getEmployeeId() == 0 && employee.getEmployeeName() == null
				&& employee.getEmployeeDesignation() == null && employee.getDepartment() == null
				&& employee.getEmail() == null && employee.getSalary() == 0.0)
			return false;
		return true;
	}

}
