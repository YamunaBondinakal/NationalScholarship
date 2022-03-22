package com.lti.scholarship.nationalscholarship.service.impl;

import java.util.List;

import com.lti.scholarship.nationalscholarship.entity.StateOfficer;

public interface StateService {

	String validateLoginDetails(Long username, String password);

	StateOfficer findState(Long aadharNumber);

	StateOfficer saveState(StateOfficer stateOfficer);

	StateOfficer updateState(StateOfficer stateOfficer);

	void deleteState(Long aadharNumber);

	List<StateOfficer> fetchStateList();

	List<StateOfficer> saveAllState(List<StateOfficer> allState);
}
