package com.lti.scholarship.nationalscholarship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.nationalscholarship.dto.studentregform.StudentRegistrationFormDTO;
import com.lti.scholarship.nationalscholarship.entity.LoginForm;
import com.lti.scholarship.nationalscholarship.entity.Student;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.service.StudentRegistrationServiceImpl;
import com.lti.scholarship.nationalscholarship.service.impl.StudentRegistrationService;
import com.lti.scholarship.nationalscholarship.service.impl.StudentService;

@RestController
@RequestMapping("/api/v1/scholarship")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRegistrationController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<String> validateLoginDetails(@RequestBody final LoginForm loginForm) {
		System.out.println("The Username: " + loginForm.getUserName() + " Password: " + loginForm.getPassword());
		return ResponseEntity.status(HttpStatus.OK).body(
				studentRegistrationService.validateLoginDetails(loginForm.getUserName(), loginForm.getPassword()));
	}

	// Plain JSON structure without actual POJO class structure
	@GetMapping(value = "/getAllStudentRegistrationsClassic", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentRegistrationFormDTO>> getAllStudentRegistrationsClassic() {

		return ResponseEntity.status(HttpStatus.OK)
				.body(studentRegistrationService.findAllStudentRegistrationFormsClassic());

	}

	// JSON with POJO class actual structure
	@GetMapping(value = "/getAllStudentRegistrationsJson", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentRegistrationForm>> getAllStudentRegistrationsJson() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(studentRegistrationService.findAllStudentRegistrationFormsJson());

	}

	// Plain JSON structure without actual POJO class structure
	@GetMapping(value = "/getStudentRegistrationClassic", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentRegistrationFormDTO> getStudentRegistrationClassic(
			@RequestParam("id") Long aadharNumber) {
		return ResponseEntity.status(HttpStatus.OK).body(studentRegistrationService
				.findStudentRegistrationFormClassic(aadharNumber).orElse(new StudentRegistrationFormDTO()));

	}

	// JSON with POJO class actual structure
	@GetMapping(value = "/getStudentRegistrationJson", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentRegistrationForm> getStudentRegistrationJson(@RequestParam("id") Long aadharNumber) {
		return ResponseEntity.status(HttpStatus.OK).body(studentRegistrationService
				.findStudentRegistrationFormJson(aadharNumber).orElse(new StudentRegistrationForm()));

	}

	// Plain JSON structure without actual POJO class structure
	@PostMapping(value = "/saveStudentRegistrationClassic", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentRegistrationFormDTO> saveStudentRegistrationClassic(
			@RequestBody final StudentRegistrationFormDTO studentRegistrationFormDTO) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(studentRegistrationService.saveStudentRegistrationFormClassic(studentRegistrationFormDTO));

	}

	// JSON with POJO class actual structure
	@PostMapping(value = "/saveStudentRegistrationJson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentRegistrationForm> saveStudentRegistrationJson(
			@RequestBody final StudentRegistrationForm studentRegistrationForm) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(studentRegistrationService.saveStudentRegistrationFormJson(studentRegistrationForm));
	}

	@GetMapping(value = "/deleteStudentRegistration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity deleteStudentRegistration(@RequestParam("id") Long id) {
		studentRegistrationService.deleteStudentRegistrationForm(id);
		return (ResponseEntity) ResponseEntity.status(HttpStatus.OK);
	}

}
