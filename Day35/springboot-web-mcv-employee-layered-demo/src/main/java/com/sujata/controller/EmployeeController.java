package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/inputEmployeeDetailsPage")
	public ModelAndView inputEmployeeDetailsPageController() {
		return new ModelAndView("InputEmployeeDetails");
	}
	
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		Employee employee=new Employee();
		employee.setEmpId(Integer.parseInt(request.getParameter("empId")));
		employee.setEmpName(request.getParameter("empName"));
		employee.setEmpDesignation(request.getParameter("empDesig"));
		employee.setEmpDepartment(request.getParameter("empDeptt"));
		employee.setEmpEmail(request.getParameter("empEmail"));
		employee.setEmpSalary(Double.parseDouble(request.getParameter("empSalary")));
		
		String message=null;
		if(employeeService.addEmployee(employee))
			message="Employee Addded Successfully";
		else
			message="Employee Addition Failed";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
}
