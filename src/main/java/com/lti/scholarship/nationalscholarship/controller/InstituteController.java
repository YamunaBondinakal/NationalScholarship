package com.lti.scholarship.nationalscholarship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.nationalscholarship.entity.Institute;
import com.lti.scholarship.nationalscholarship.service.impl.InstituteService;

@RestController
@RequestMapping("/v1/api")
public class InstituteController {
	@Autowired
	private InstituteService instituteService;
	
	

	@GetMapping(value = "/getAllInstitutes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Institute>> findAllInstitutes() {
		return ResponseEntity.ok().body(instituteService.fetchInstituteList());
	}

	@GetMapping(value = "/getInstitute", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Institute> getInstitute(@RequestParam("id") Long instituteId) {
		return ResponseEntity.ok().body(instituteService.findInstitute(instituteId));
	}

	@PutMapping(value = "/updateInstitute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Institute> updateInstitute(@RequestBody final Institute institute) {
		return ResponseEntity.ok().body(instituteService.updateInstitute(institute));
	}

	@PostMapping(value = "/saveInstitute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Institute> saveInstitute(@RequestBody final Institute institute) {
		return ResponseEntity.ok().body(instituteService.saveInstitute(institute));
	}

	@PostMapping(value = "/saveAllInstitute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Institute>> saveAllInstitute(@RequestBody final List<Institute> institute) {
		return ResponseEntity.ok().body(instituteService.saveAllInstitute(institute));
	}

	@DeleteMapping(value = "/deleteInstitute", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteInstitute(@RequestParam("id") Long id) {
		instituteService.deleteInstitute(id);
		return ResponseEntity.ok().body("Record Number:" + id + " has been deleted");
	}
}
