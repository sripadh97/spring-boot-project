package com.student.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Student;
//Repository that extends CrudRepository
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
}
