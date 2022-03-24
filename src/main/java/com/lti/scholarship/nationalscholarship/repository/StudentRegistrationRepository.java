package com.lti.scholarship.nationalscholarship.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;

public interface StudentRegistrationRepository extends CrudRepository<StudentRegistrationForm, Long>  {

	@Query(value = "SELECT password FROM tbl_student_reg where aadhar_Number=?1", nativeQuery = true)
	Optional<String> getLoginDetails(Long userName);

}
