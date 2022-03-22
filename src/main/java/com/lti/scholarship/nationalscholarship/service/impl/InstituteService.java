package com.lti.scholarship.nationalscholarship.service.impl;

import java.util.List;

import com.lti.scholarship.nationalscholarship.entity.Institute;

public interface InstituteService {

	String validateLoginDetails(Long username, String password);

	Institute findInstitute(Long aadharNumber);

	Institute saveInstitute(Institute institute);

	Institute updateInstitute(Institute institute);

	void deleteInstitute(Long aadharNumber);

	List<Institute> fetchInstituteList();

	List<Institute> saveAllInstitute(List<Institute> allInstitute);
}
