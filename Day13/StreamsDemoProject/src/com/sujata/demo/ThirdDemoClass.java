package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import static java.util.stream.Collectors.*;

public class ThirdDemoClass {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(101, "AAAA", "IT", "Associate", 25000),
				new Employee(102, "BBBB", "Sales", "Sr. Associate", 50000),
				new Employee(103, "CCCC", "Marketing", "Associate", 28000),
				new Employee(104, "DDDD", "HR", "Manager", 125000),
				new Employee(105, "EEEE", "IT", "Manager", 215000),
				new Employee(106, "FFFF", "IT", "Associate", 35000));

		List<Employee> empListWorkingInITDeptt= empList.stream()
				.filter(emp->emp.getEmpDepartment().equals("IT"))
				.limit(2)
				.collect(Collectors.toList());
		
		empListWorkingInITDeptt.forEach(System.out::println);
		
	}

}
