package com.example.in_mapping.ques2;

import com.example.in_mapping.ques2.entities.Student;
import com.example.in_mapping.ques2.entities.Teacher;
import com.example.in_mapping.ques2.services.StudentDaoService;
import com.example.in_mapping.ques2.services.TeacherDaoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaPart2AssignmentApplicationTests {

	@Autowired
	StudentDaoService studentDaoService;

	@Autowired
	TeacherDaoService teacherDaoService;


	@Test
	void contextLoads() {
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


}
