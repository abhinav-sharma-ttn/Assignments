package com.example.jpa.demo.example.jpa;

import com.example.jpa.demo.example.jpa.entities.Employee;
import com.example.jpa.demo.example.jpa.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	// 3) Perform Create Operation on Entity using Spring Data JPA
	@Test
	void testCreateEmployee() {
		Employee employee1 = new Employee(1, "Abhinav", "Delhi", 21);
		Employee employee2 = new Employee(2, "Abhinav", "Noida", 24);
		Employee employee3 = new Employee(3, "Abhinav", "Delhi", 20);
		Employee employee4 = new Employee(4, "Mohit", "Punjab", 30);

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
	}

	// 6) Perform Read Operation on Entity using Spring Data JPA
	@Test
	void testFetchEmployee() {
		Employee employee = employeeRepository.findById(1).orElse(null);
		assertNotNull(employee);
		System.out.println("Emp : " + employee);
	}

	// 4) Perform Update Operation on Entity using Spring Data JPA
	@Test
	void testUpdateEmployee() {
		Employee employee = employeeRepository.findById(1).orElse(null);
		assertNotNull(employee);
		employee.setAge(30);
		employeeRepository.save(employee);
	}

	// 5) Perform Delete Operation on Entity using Spring Data JPA
	@Test
	void testDeleteEmployee() {
		employeeRepository.deleteById(2);
	}

	// 7) Get the total count of the number of Employees
	@Test
	void testCountOfEmployee() {
		System.out.println("No. of Employees : " + employeeRepository.count());
	}

	@Test
	void testFindByName() {
		ArrayList<Employee> employees = employeeRepository.findByName("Abhinav");
		employees.forEach(System.out::println);
	}

	@Test
	void testFindByNameLike() {
		ArrayList<Employee> employees = employeeRepository.findByNameLike("A%");
		employees.forEach(System.out::println);
	}

	@Test
	void testFindByAgeBetween() {
		ArrayList<Employee> employees = employeeRepository.findByAgeBetween(22, 24);
		employees.forEach(System.out::println);
	}

	// 7) Implement Pagination and Sorting on the bases of Employee Age

//	@Test
//	void testFindAllPaging() {
//		Pageable pageable = (Pageable) PageRequest.of(0, 1);
//		Page<Employee> employeePage = employeeRepository.findAll((org.springframework.data.domain.Pageable) pageable);
//		employeePage.forEach(System.out::println);
//	}


	@Test
	void testSortEmployeeByAge() {
		employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "age"))
				.forEach(System.out::println);
	}
}
