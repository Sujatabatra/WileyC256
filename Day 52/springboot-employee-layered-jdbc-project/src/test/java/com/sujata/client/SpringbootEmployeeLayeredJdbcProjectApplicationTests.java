package com.sujata.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootTest/*(classes = SpringbootEmployeeLayeredJdbcProjectApplication.class)*/
class SpringbootEmployeeLayeredJdbcProjectApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testSearchRecord() {
		Employee employee=employeeDao.searchRecord(101);
		assertEquals("AAAA", employee.getEmpName());
	}
}
