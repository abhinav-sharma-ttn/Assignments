package com.example.jpa.part2.assignment;

import com.example.jpa.part2.assignment.component_mapping.entities.NewEmployee;
import com.example.jpa.part2.assignment.component_mapping.entities.Salary;
import com.example.jpa.part2.assignment.component_mapping.services.DoaServiceNewEmployee;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities.Student;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities.Teacher;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.services.StudentDaoService;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.services.TeacherDaoService;
import com.example.jpa.part2.assignment.services.DaoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoJpaPart2AssignmentApplicationTests {

	@Autowired
	DaoService daoService;

	@Autowired
	StudentDaoService studentDaoService;

	@Autowired
	DoaServiceNewEmployee doaServiceNewEmployee;

	@Autowired
	TeacherDaoService teacherDaoService;

	@Test
	void contextLoads() {
	}

	@Test
	void testFindParticularEmployees() {
		List<Object[]> employeesList = daoService.retrieveParticularEmployeesFromDB();
		for(Object[] employee : employeesList) {
			System.out.println("First Name : " + employee[0]);
			System.out.println("Last Name : " + employee[1]);
		}
	}

	@Test
	void testFindAllEmployeesWithLastNameSingh() {
		List<Object[]> employeesList = daoService.retrieveAllEmployeesWithLastNameSinghFromDB("Singh");
		for(Object[] employee : employeesList) {
			System.out.println("ID : " + employee[0]);
			System.out.println("First Name : " + employee[1]);
			System.out.println("Age : " + employee[2]);
			System.out.println();
		}
	}

	@Test
	void testDeleteEmployeeWhoseAgeIsMoreThan45() {
		daoService.deleteEmployeeWhoseAgeIsMoreThan45FromDB(45);
	}

	@Test
	void testDeleteEmployeeWithMinSalary() {
		daoService.deleteEmployeeWithMinSalaryFromDB();
	}

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Abhinav");
		student.setLastName("Sharma");
		student.setMarks(10);
		student.setAge(20);

		studentDaoService.saveStudentInDB(student);
	}

	@Test
	void testCreateTeacher() {
		Teacher teacher = new Teacher();
		teacher.setId(2);
		teacher.setFirstName("Mohan");
		teacher.setLastName("Das");
		teacher.setAge(50);
		teacher.setSalary(30000.12);

		teacherDaoService.saveTeacherInDB(teacher);
	}

	@Test
	void testSaveNewEmployee() {
		NewEmployee employee = new NewEmployee();
		employee.setId(1);
		employee.setAge(20);
		employee.setFirstName("Abhinav");
		employee.setLastName("Sharma");
		employee.setSalary(new Salary(1230, 3000, 4500, 1234));

		doaServiceNewEmployee.saveEmployeeInDB(employee);
	}

}
