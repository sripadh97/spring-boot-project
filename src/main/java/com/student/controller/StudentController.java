package com.student.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.student.model.Student;
import com.student.service.StudentService;
//marking class as Controller
@RestController
public class StudentController {
	//Autowire the StudentService class
	@Autowired
	StudentService studentService;
	//create a get mapping that retrieves all the student details from the database
	@GetMapping("/student")
	private List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	//create a get mapping that retrieves specific student detail
	@GetMapping("/student/{studentid}")
	private Student getStudent(@PathVariable("studentid") int studentid) {
		return studentService.getStudentById(studentid);
	}
	//create a delete mapping that deletes specific student detail
	@DeleteMapping("/student/{studentid}")
	private void deleteStudent(@PathVariable("studentid") int studentid) {
		studentService.delete(studentid);
	}
	//create post mapping that post the student detail in the database
	@PostMapping("/students")
	private int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getStudentid();
	}
	//creating put mapping that updates the student detail
	@PutMapping("/students")
	private Student update(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student;
	}
}

