package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
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
		Employees employees=restTemplate.getForObject("http://localhost:8082/employees", Employees.class); 
		return employees.getEmployees();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
//		return employeeDao.searchRecord(employeeId);
		return null;
	}

	/*
	 * HR= 15% of Basic
	 * DA= 18% of Basic
	 * PF= 12% of Basic
	 */
	@Override
	public EmployeePayslip generatePayslip(int employeeId) {
//		Employee employee=employeeDao.searchRecord(employeeId);
//		EmployeePayslip employeePayslip=null;
//		if(employee!=null) {
//		double hr=.15*employee.getEmpSalary();
//		double da=.18*employee.getEmpSalary();
//		double pf=.12*employee.getEmpSalary();
//		double total=employee.getEmpSalary()+hr+da-pf;
//		employeePayslip=new EmployeePayslip(employee, hr, pf, da, total);
//		}
//		return employeePayslip;
	return null;
}

	@Override
	public boolean addEmployee(Employee employee) {
//		if(employeeDao.addRecord(employee)>0)
//			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
//		if(employeeDao.deleteRecord(employeeId)>0)
//			return true;
		return false;
	}

}
