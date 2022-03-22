package com.lti.scholarship.nationalscholarship.service.impl;

import java.util.List;

import com.lti.scholarship.nationalscholarship.entity.Student;

public interface StudentService {
	Student findStudent(Long id);

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	void deleteStudent(Long id);

	List<Student> fetchStudentList();

	List<Student> saveAllStudent(List<Student> allStudent);
}
