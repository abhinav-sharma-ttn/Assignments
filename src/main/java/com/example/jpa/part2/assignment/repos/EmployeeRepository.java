package com.example.jpa.part2.assignment.repos;

import com.example.jpa.part2.assignment.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // JPQL Queries
    @Query("from Employee")
    List<Employee> findAllEmployees();

    @Query("select firstName, lastName from Employee where salary > (select avg(salary) from Employee) order by firstName asc, salary desc")
    List<Object[]> findFirstAndLastNameOfEmployeesSalaryMoreThanAvg();


    @Query("delete from Employee where salary = (select min(salary) from Employee)")
    void deleteEmployeeWithMinSalary();


    // Native Query


    @Query(value = "select id, emp_first_name, age from employee_table where emp_last_name LIKE '%s:lastName'", nativeQuery = true)
    List<Object[]> findAllEmployeesWithLastNameSingh(@Param("lastName") String lastName);

    @Query(value = "delete from employee_table where age > :age", nativeQuery = true)
    void deleteEmployeeWhoseAgeIsMoreThan45(@Param("age") int age);
}
