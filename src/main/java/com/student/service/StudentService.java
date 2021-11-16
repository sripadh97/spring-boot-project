package com.student.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.model.Student;
import com.student.repository.StudentRepository;

//import com.student.repository.StudentRepository;
//business logic
@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;
	//getting all students details
	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1->student.add(student1));
		return student;
	}
	//getting a specific student detail by findById() of Crud Repository
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	//saving a specific student details by save() method of Crud Repository
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}
	//deleting a specific record by deleteById() Crud Repository
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	//updating a record
	public void update(Student student, int studentid) {
		studentRepository.save(student);
	}
}
