package com.crud_operation2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crud_operation2.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
