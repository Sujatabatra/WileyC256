package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//	public ModelAndView saveEmployeeController(HttpServletRequest request) {
	public ModelAndView saveEmployeeController(@RequestParam("empId") int id,@RequestParam("empName") String name,
			@RequestParam("empDesig") String desig,@RequestParam("empDeptt") String deptt,
			@RequestParam("empEmail") String email,@RequestParam("empSalary") double sal) {
		
		ModelAndView modelAndView = new ModelAndView();

		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpDesignation(desig);
		employee.setEmpDepartment(deptt);
		employee.setEmpEmail(email);
		employee.setEmpSalary(sal);

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
	public ModelAndView deleteEmployeeController(@RequestParam("empId") int id) {
		ModelAndView modelAndView = new ModelAndView();

		String message = "";
		if (employeeService.deleteEmployee(id))
			message = "Employee with ID " + id + " Deleted !";
		else
			message = "Employee with ID " + id + " Does not exist !";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}

	@RequestMapping("/inputEmpIdPageForSearch")
	public ModelAndView inputEmpIdPageForSearchController() {
		return new ModelAndView("InputEmployeeIdForSearch");
	}

	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(@RequestParam("empId") int id) {
		ModelAndView modelAndView = new ModelAndView();

		Employee employee = employeeService.searchEmployeeById(id);
		if (employee != null) {
			modelAndView.addObject("employee", employee);
			modelAndView.setViewName("ShowEmployee");
		}
		else {
			String message="Employee with ID "+id+" does not exist!";
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
