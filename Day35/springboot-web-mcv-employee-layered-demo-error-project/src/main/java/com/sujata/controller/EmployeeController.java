package com.sujata.controller;

import java.util.List;

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
		ModelAndView modelAndView = new ModelAndView();

		Employee employee = new Employee();
		employee.setEmpId(Integer.parseInt(request.getParameter("empId")));
		employee.setEmpName(request.getParameter("empName"));
		employee.setEmpDesignation(request.getParameter("empDesig"));
		employee.setEmpDepartment(request.getParameter("empDeptt"));
		employee.setEmpEmail(request.getParameter("empEmail"));
		employee.setEmpSalary(Double.parseDouble(request.getParameter("empSalary")));

		String message = null;
		if (employeeService.addEmployee(employee))
			message = "Employee Addded Successfully";
		else
			message = "Employee Addition Failed";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}

	@RequestMapping("/inputEmpIdPageForDelete")
	public ModelAndView inputEmpIdPageForDeleteController() {
		return new ModelAndView("InputEmployeeIdForDelete");
	}

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		String message = "";
		if (employeeService.deleteEmployee(Integer.parseInt(request.getParameter("empId"))))
			message = "Employee with ID " + request.getParameter("empId") + " Deleted !";
		else
			message = "Employee with ID " + request.getParameter("empId") + " Does not exist !";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}

	@RequestMapping("/inputEmpIdPageForSearch")
	public ModelAndView inputEmpIdPageForSearchController() {
		return new ModelAndView("InputEmployeeIdForSearch");
	}

	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		Employee employee = employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empId")));
		if (employee != null) {
			modelAndView.addObject("employee", employee);
			modelAndView.setViewName("ShowEmployee");
		}
		else {
			String message="Employee with ID "+request.getParameter("empId")+" does not exist!";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("Output");
		}
		return modelAndView;
	}
	
	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployeesController() {
		
		List<Employee> employees=employeeService.getAllEmployees();
		
		return new ModelAndView("ShowAllEmployees", "employeeList", employees);
		
	}
}
