package com.lti.scholarship.nationalscholarship.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.nationalscholarship.entity.MinistryOfficer;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.repository.MinistryRepository;
import com.lti.scholarship.nationalscholarship.service.impl.MinistryService;

@Service
public class MinistryServiceImpl implements MinistryService {
	@Autowired
	private MinistryRepository ministryRepository;

	@Override
	public String validateLoginDetails(Long username, String password) {
		String message = "Some Exception Occured while connecting to database";
		final boolean value = ministryRepository.existsById(username);
		if (value == true) {
			Optional<MinistryOfficer> ministryOfficer = ministryRepository.findById(username);
			if (ministryOfficer.isPresent() == true) {
				if (ministryOfficer.get().getPassword().equals(password)) {
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
	public MinistryOfficer findMinistry(Long aadharNumber) {
		Optional<MinistryOfficer> ministryOfficer = ministryRepository.findById(aadharNumber);
		return ministryOfficer.orElseGet(MinistryOfficer::new);
	}

	@Override
	public MinistryOfficer saveMinistry(MinistryOfficer ministryOfficer) {
		return ministryRepository.save(ministryOfficer);
	}

	@Override
	public MinistryOfficer updateMinistry(MinistryOfficer ministryOfficer) {
		return ministryRepository.save(ministryOfficer);
	}

	@Override
	public void deleteMinistry(Long aadharNumber) {
		ministryRepository.deleteById(aadharNumber);
	}

	@Override
	public List<MinistryOfficer> fetchMinistryList() {
		return (List<MinistryOfficer>) ministryRepository.findAll();
	}

	@Override
	public List<MinistryOfficer> saveAllMinistry(List<MinistryOfficer> allMinistry) {
		return (List<MinistryOfficer>) ministryRepository.saveAll(allMinistry);
	}

}
