//2) Set up EmployeeRepository with Spring Data JPA

package com.example.jpa.demo.example.jpa.repos;

import com.example.jpa.demo.example.jpa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//    8) Create and use finder to find Employee by Name
      ArrayList<Employee> findByName(String name);

//    (9) Create and use finder to find Employees starting with A character
      ArrayList<Employee> findByNameLike(String name);

//    (10) Create and use finder to find Employees Between the age of 28 to 32
      ArrayList<Employee> findByAgeBetween(int min, int max);
}
