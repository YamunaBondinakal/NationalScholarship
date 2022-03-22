package com.lti.scholarship.nationalscholarship.service;

import static com.lti.scholarship.nationalscholarship.transformer.JavaObjectTransformer.buildAndGetStudentDTOByEntity;
import static com.lti.scholarship.nationalscholarship.transformer.JavaObjectTransformer.buildAndGetStudentEntityByDTO;
import com.lti.scholarship.nationalscholarship.dto.studentregform.StudentRegistrationFormDTO;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.repository.StudentRegistrationRepository;
import com.lti.scholarship.nationalscholarship.service.impl.StudentRegistrationService;
import com.lti.scholarship.nationalscholarship.transformer.JavaObjectTransformer;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;

	@Override
	public String validateLoginDetails(Long username, String password) {
		String message = "Some Exception Occured while connecting to database";
		final boolean value = studentRegistrationRepository.existsById(username);
		if (value == true) {
			Optional<StudentRegistrationForm> studentRegistrationForm = studentRegistrationRepository
					.findById(username);
			if (studentRegistrationForm.isPresent() == true) {
				if (studentRegistrationForm.get().getPassword().equals(password)) {
					message = "Success";
				} else {
					message = "Invalid Password For UserName";
				}
			}
		} else {
			message = "Invalid UserName";
		}
		return message;
	}

	// Asusual POJO class StudentRegistrationForm structure send it to client.
	@Override
	public List<StudentRegistrationForm> findAllStudentRegistrationFormsJson() {
		return (List<StudentRegistrationForm>) studentRegistrationRepository.findAll();
	}

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and send it to client using DTO transformer
	@Override
	public List<StudentRegistrationFormDTO> findAllStudentRegistrationFormsClassic() {
		List<StudentRegistrationForm> registrationFormList = (List<StudentRegistrationForm>) studentRegistrationRepository
				.findAll();

		return (Optional.ofNullable(registrationFormList).orElse(Collections.emptyList()).stream()
				.map(JavaObjectTransformer::buildAndGetStudentDTOByEntity).collect(Collectors.toList()));
	}

	// Asusual POJO class StudentRegistrationForm structure send it to client.
	@Override
	public Optional<StudentRegistrationForm> findStudentRegistrationFormJson(Long aadharNumber) {
		return studentRegistrationRepository.findById(aadharNumber);
	}

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and send it to client using DTO transformer
	@Override
	public Optional<StudentRegistrationFormDTO> findStudentRegistrationFormClassic(Long aadharNumber) {
		return Optional.ofNullable(buildAndGetStudentDTOByEntity(studentRegistrationRepository.findById(aadharNumber)
				.orElse(new com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm())));

	}

	// Asusual POJO class StudentRegistrationForm structure send it to client.
	@Override
	public StudentRegistrationForm saveStudentRegistrationFormJson(StudentRegistrationForm studentRegistrationForm) {
		StudentRegistrationForm studentRegistrationForm1 = new StudentRegistrationForm();
		if (studentRegistrationForm.getPassword() == null && studentRegistrationForm.getConfirmPassword() == null) {
			studentRegistrationForm1 = updateRegFormOnActualForm(studentRegistrationForm,
					findStudentRegistrationFormJson(studentRegistrationForm.getAadharNumber()).get());

		}

		studentRegistrationForm1 = studentRegistrationRepository.save(studentRegistrationForm);
		return studentRegistrationForm1;

	}

	// Converting StudentRegistrationForm pojo class structure to classic structure
	// and
	// send it to client using DTO transformer
	@Override
	public StudentRegistrationFormDTO saveStudentRegistrationFormClassic(
			StudentRegistrationFormDTO studentRegistrationFormDTO) {
		StudentRegistrationForm registrationForm = buildAndGetStudentEntityByDTO(studentRegistrationFormDTO);
		StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();
		if (registrationForm.getPassword() == null && registrationForm.getConfirmPassword() == null) {
			studentRegistrationForm = updateRegFormOnActualForm(studentRegistrationForm,
					findStudentRegistrationFormJson(studentRegistrationForm.getAadharNumber()).get());
			studentRegistrationForm = studentRegistrationRepository.save(studentRegistrationForm);
		} else {
			studentRegistrationForm = studentRegistrationRepository.save(registrationForm);
		}
		return buildAndGetStudentDTOByEntity(studentRegistrationForm);
	}

	public StudentRegistrationForm updateRegFormOnActualForm(StudentRegistrationForm actual,
			StudentRegistrationForm newForm) {
		actual.setStateOfDomicile(newForm.getStateOfDomicile());
		actual.setDistrictOfDomicile(newForm.getDistrictOfDomicile());
		actual.setName(newForm.getName());
		actual.setDob(newForm.getDob());
		actual.setGender(newForm.getGender());
		actual.setMobileNumber(newForm.getMobileNumber());
		actual.setEmailId(newForm.getEmailId());
		actual.setInstituteId(newForm.getInstituteId());
		actual.setBankName(newForm.getBankName());
		actual.setIfscCode(newForm.getIfscCode());
		actual.setAccountNumber(newForm.getAccountNumber());
		actual.setPassword(newForm.getPassword());
		actual.setConfirmPassword(newForm.getConfirmPassword());
		actual.setRegFormTermsAndConditions(newForm.isRegFormTermsAndConditions());
		return actual;
	}

	@Override
	public void deleteStudentRegistrationForm(Long aadharNumber) {
		// TODO Auto-generated method stub
		studentRegistrationRepository.deleteById(aadharNumber);
	}

}
