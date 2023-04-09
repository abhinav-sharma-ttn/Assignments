package com.example.jpa.part2.assignment.inheritance_mapping.single_table.repos;

import com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
