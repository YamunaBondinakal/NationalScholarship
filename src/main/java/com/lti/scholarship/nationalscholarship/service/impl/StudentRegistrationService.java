package com.lti.scholarship.nationalscholarship.service.impl;

import java.util.List;
import java.util.Optional;

import com.lti.scholarship.nationalscholarship.dto.studentregform.StudentRegistrationFormDTO;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;

public interface StudentRegistrationService {

	String validateLoginDetails(Long username, String password);

	List<StudentRegistrationForm> findAllStudentRegistrationFormsJson();

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and send it to client using DTO transformer
	List<StudentRegistrationFormDTO> findAllStudentRegistrationFormsClassic();

	// Asusual POJO class StudentRegistrationForm structure send it to client.
	Optional<StudentRegistrationForm> findStudentRegistrationFormJson(Long aadharNumber);

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and send it to client using DTO transformer
	Optional<StudentRegistrationFormDTO> findStudentRegistrationFormClassic(Long aadharNumber);

	// Asusual POJO class StudentRegistrationForm structure send it to client.
	StudentRegistrationForm saveStudentRegistrationFormJson(StudentRegistrationForm studentRegistrationForm);

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and send it to client using DTO transformer
	StudentRegistrationFormDTO saveStudentRegistrationFormClassic(
			StudentRegistrationFormDTO studentRegistrationFormDTO);

	void deleteStudentRegistrationForm(Long aadharNumber);

}
