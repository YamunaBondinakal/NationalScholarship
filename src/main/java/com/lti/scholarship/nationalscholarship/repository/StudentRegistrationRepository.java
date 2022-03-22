package com.lti.scholarship.nationalscholarship.repository;

import org.springframework.data.repository.CrudRepository;

import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;

public interface StudentRegistrationRepository extends CrudRepository<StudentRegistrationForm, Long>  {

}
