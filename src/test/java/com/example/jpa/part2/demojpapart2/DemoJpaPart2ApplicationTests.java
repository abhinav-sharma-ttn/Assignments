package com.example.jpa.part2.demojpapart2;

import com.example.jpa.part2.demojpapart2.entities.Employee;
import com.example.jpa.part2.demojpapart2.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

@SpringBootTest
class DemoJpaPart2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRetrieveAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAllEmployee();
		System.out.println("********************************************");
		employeeList.forEach(System.out::println);
	}

	@Test
	void testRetrievePartialInfoOfEmployee() {
		List<Object[]> employeeList = employeeRepository.findFirstAndLastNameOfEmployee();
		System.out.println("********************************************");
		for(Object[] emp : employeeList) {
			System.out.println("First name : " + emp[0]);
			System.out.println("Last name : " + emp[1]);
		}
	}

	@Test
	void testRetrieveAllEmployeeWithGivenFirstName() {
		List<Employee> employeeList = employeeRepository.findEmployeeWithGivenFirstName("Abhinav");
		employeeList.forEach(System.out::println);
	}
}
