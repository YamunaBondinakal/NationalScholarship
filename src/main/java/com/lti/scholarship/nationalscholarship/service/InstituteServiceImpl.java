package com.lti.scholarship.nationalscholarship.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.nationalscholarship.entity.Institute;
import com.lti.scholarship.nationalscholarship.repository.InstituteRepository;
import com.lti.scholarship.nationalscholarship.service.impl.InstituteService;

@Service
public class InstituteServiceImpl implements InstituteService {
	@Autowired
	private InstituteRepository instituteRepository;

	@Override
	public String validateLoginDetails(Long username, String password) {
		String message = "Some Exception Occured while connecting to database";
		final boolean value = instituteRepository.existsById(username);
		if (value == true) {
			Optional<Institute> institute = instituteRepository.findById(username);
			if (institute.isPresent() == true) {
				if (institute.get().getPassword().equals(password)) {
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
	public Institute findInstitute(Long aadharNumber) {
		Optional<Institute> institute = instituteRepository.findById(aadharNumber);
		return institute.orElseGet(Institute::new);
	}

	@Override
	public Institute saveInstitute(Institute institute) {
		return instituteRepository.save(institute);
	}

	@Override
	public Institute updateInstitute(Institute institute) {
		return instituteRepository.save(institute);
	}

	@Override
	public void deleteInstitute(Long aadharNumber) {
		instituteRepository.deleteById(aadharNumber);
	}

	@Override
	public List<Institute> fetchInstituteList() {
		return (List<Institute>) instituteRepository.findAll();
	}

	@Override
	public List<Institute> saveAllInstitute(List<Institute> allInstitute) {
		return (List<Institute>) instituteRepository.saveAll(allInstitute);
	}

}
