package com.example.jpa.part2.demojpapart2.repos;

import com.example.jpa.part2.demojpapart2.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    @Query("from Employee")
    List<Employee> findAllEmployee();

    @Query("select firstName, lastName from Employee")
    List<Object[]> findFirstAndLastNameOfEmployee();  // in case of partial data list of object array is returned.

    @Query("form Employee where firstName =:fName")            //
    List<Employee> findEmployeeWithGivenFirstName(@Param("fName") String firstName);

    @Query("form Employee where age >: min and age <: max")         //
    List<Employee> findEmployeeWithAgeInGivenRange(@Param("min") int min, @Param("max") int max);

    @Modifying
    @Query("delete from Employee where firstName=:firstName")             //
    void deleteEmployeeWithFirstName(@Param("firstName") String firstName);

    // Native SQL Query
    @Query(value = "select * from employeeTable", nativeQuery = true)     //
    List<Employee> findAllEmployeeUsingNQ();

    @Query(value = "select * from employeeTable where empFirstName =: firstName", nativeQuery = true)
    List<Employee> findAllEmployeeUsingFirstNameNQ(@Param("firstName") String firstName);
}
