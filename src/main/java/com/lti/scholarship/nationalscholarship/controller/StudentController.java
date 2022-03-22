package com.lti.scholarship.nationalscholarship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.nationalscholarship.entity.Student;
import com.lti.scholarship.nationalscholarship.service.impl.StudentService;

@RestController
@RequestMapping("/v1/api")
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/getAllStudents",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getAllStudents() {
		return ResponseEntity.ok().body(studentService.fetchStudentList());
	}
	
	@GetMapping(value="/getStudent",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudent(@RequestParam("id") Long studentId) {
		return ResponseEntity.ok().body(studentService.findStudent(studentId));
	}
	
	@PutMapping(value="/updateStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> updateStudent(@RequestBody final Student student){
		return ResponseEntity.ok().body(studentService.updateStudent(student));
	}
	
	@PostMapping(value="/saveStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> saveStudent(@RequestBody final Student student){
		return ResponseEntity.ok().body(studentService.saveStudent(student));
	}
	
	@PostMapping(value="/saveAllStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> saveAllStudents(@RequestBody final List<Student> studentList){
		return ResponseEntity.ok().body(studentService.saveAllStudent(studentList));
	}
	
	@DeleteMapping(value="/deleteStudent",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteStudent(@RequestParam("id") Long studentId){
		studentService.deleteStudent(studentId);
		return ResponseEntity.ok().body("Record Number:"+studentId+" has been deleted");
	}
}
