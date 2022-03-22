package com.lti.scholarship.nationalscholarship.service.impl;

import java.util.List;

import com.lti.scholarship.nationalscholarship.entity.MinistryOfficer;

public interface MinistryService {

	String validateLoginDetails(Long username, String password);

	MinistryOfficer findMinistry(Long aadharNumber);

	MinistryOfficer saveMinistry(MinistryOfficer ministryOfficer);

	MinistryOfficer updateMinistry(MinistryOfficer ministryOfficer);

	void deleteMinistry(Long aadharNumber);

	List<MinistryOfficer> fetchMinistryList();

	List<MinistryOfficer> saveAllMinistry(List<MinistryOfficer> allMinistry);
}
