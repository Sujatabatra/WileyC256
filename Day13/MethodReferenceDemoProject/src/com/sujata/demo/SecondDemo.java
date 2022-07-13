package com.sujata.demo;

@FunctionalInterface
interface EmployeeFactory {
	Employee getEmployeeInstance(int id, String name, double salary);
}

public class SecondDemo {

	public static void main(String args[]) {
//		EmployeeFactory employeeFactory=new EmployeeFactory() {
//			@Override
//			public Employee getEmployeeInstance(int id, String name, double salary) {
//				return new Employee(id, name, salary);
//			}
//		};

//		EmployeeFactory employeeFactory=(id,name,salary)-> {
//				return new Employee(id, name, salary);
//			};

//		EmployeeFactory employeeFactory = (id, name, salary) -> new Employee(id, name, salary);
		
		EmployeeFactory employeeFactory = Employee::new;

		System.out.println(employeeFactory.getEmployeeInstance(101, "AAA", 12345));
	}
}
