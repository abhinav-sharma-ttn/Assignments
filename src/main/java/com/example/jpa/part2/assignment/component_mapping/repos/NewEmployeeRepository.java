package com.example.jpa.part2.assignment.component_mapping.repos;

import com.example.jpa.part2.assignment.component_mapping.entities.NewEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewEmployeeRepository extends JpaRepository<NewEmployee, Integer> {
}
