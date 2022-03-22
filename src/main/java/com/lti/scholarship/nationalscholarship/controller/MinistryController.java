package com.lti.scholarship.nationalscholarship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.lti.scholarship.nationalscholarship.entity.MinistryOfficer;
import com.lti.scholarship.nationalscholarship.service.impl.MinistryService;

@RestController
@RequestMapping("/v1/api")
public class MinistryController {
	@Autowired
	private MinistryService ministryService;

	@GetMapping(value = "/getAllMinistries", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MinistryOfficer>> getAllMinistries() {
		return ResponseEntity.status(HttpStatus.OK).body(ministryService.fetchMinistryList());
	}

	@GetMapping(value = "/getMinistry", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MinistryOfficer> getMinistry(@RequestParam("id") Long ministryId) {
		return ResponseEntity.status(HttpStatus.OK).body(ministryService.findMinistry(ministryId));
	}

	@PutMapping(value = "/updateMinistry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MinistryOfficer> updateMinistry(@RequestBody final MinistryOfficer ministryOfficer) {
		return ResponseEntity.status(HttpStatus.OK).body(ministryService.updateMinistry(ministryOfficer));
	}

	@PostMapping(value = "/saveMinistry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MinistryOfficer> saveMinistry(@RequestBody final MinistryOfficer ministryOfficer) {
		return ResponseEntity.status(HttpStatus.OK).body(ministryService.saveMinistry(ministryOfficer));
	}

	@PostMapping(value = "/saveAllMinistry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MinistryOfficer>> saveAllMinistry(
			@RequestBody final List<MinistryOfficer> ministryList) {
		return ResponseEntity.status(HttpStatus.OK).body(ministryService.saveAllMinistry(ministryList));
	}

	@DeleteMapping(value = "/deleteMinistry", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteMinistry(@RequestParam("id") Long id) {
		ministryService.deleteMinistry(id);
		return ResponseEntity.status(HttpStatus.OK).body("Record Number:" + id + " has been deleted");
	}

}
