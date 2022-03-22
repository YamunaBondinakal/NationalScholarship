package com.lti.scholarship.nationalscholarship.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.nationalscholarship.entity.StateOfficer;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.repository.StateRepository;
import com.lti.scholarship.nationalscholarship.service.impl.StateService;

@Service
public class StateServiceImpl implements StateService {
	@Autowired
	private StateRepository stateRepository;

	@Override
	public String validateLoginDetails(Long username, String password) {
		String message = "Some Exception Occured while connecting to database";
		final boolean value = stateRepository.existsById(username);
		if (value == true) {
			Optional<StateOfficer> stateOfficer = stateRepository.findById(username);
			if (stateOfficer.isPresent() == true) {
				if (stateOfficer.get().getPassword().equals(password)) {
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

	@Override
	public StateOfficer findState(Long aadharNumber) {
		Optional<StateOfficer> stateOfficer = stateRepository.findById(aadharNumber);
		return stateOfficer.orElseGet(StateOfficer::new);
	}

	@Override
	public StateOfficer saveState(StateOfficer stateOfficer) {
		return stateRepository.save(null);
	}

	@Override
	public StateOfficer updateState(StateOfficer stateOfficer) {
		return stateRepository.save(null);
	}

	@Override
	public void deleteState(Long aadharNumber) {
		stateRepository.deleteById(aadharNumber);
	}

	@Override
	public List<StateOfficer> fetchStateList() {
		return (List<StateOfficer>) stateRepository.findAll();
	}

	@Override
	public List<StateOfficer> saveAllState(List<StateOfficer> allState) {
		return (List<StateOfficer>) stateRepository.saveAll(allState);
	}

}
