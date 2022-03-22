package com.lti.scholarship.nationalscholarship.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.nationalscholarship.entity.Student;
import com.lti.scholarship.nationalscholarship.repository.StudentRepository;
import com.lti.scholarship.nationalscholarship.service.impl.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student findStudent(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		return student.orElseGet(Student::new);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public List<Student> saveAllStudent(List<Student> allStudent) {
		return (List<Student>) studentRepository.saveAll(allStudent);
	}

}
