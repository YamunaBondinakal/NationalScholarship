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

import com.lti.scholarship.nationalscholarship.entity.StateOfficer;
import com.lti.scholarship.nationalscholarship.service.impl.StateService;

@RestController
@RequestMapping("/v1/api")
public class StateController {
	@Autowired
	private StateService stateService;

	@GetMapping(value = "/getAllStates", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StateOfficer>> getAllStates() {
		return ResponseEntity.status(HttpStatus.OK).body(stateService.fetchStateList());
	}

	@GetMapping(value = "/getState", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StateOfficer> getState(@RequestParam("id") Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(stateService.findState(id));
	}

	@PutMapping(value = "/updateState", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StateOfficer> updateState(@RequestBody final StateOfficer stateOfficer) {
		return ResponseEntity.status(HttpStatus.OK).body(stateService.updateState(stateOfficer));
	}

	@PostMapping(value = "/saveState", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StateOfficer> saveState(@RequestBody final StateOfficer stateOfficer) {
		return ResponseEntity.status(HttpStatus.OK).body(stateService.saveState(stateOfficer));
	}

	@PostMapping(value = "/saveAllStates", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StateOfficer>> saveAllStates(@RequestBody final List<StateOfficer> statesList) {
		return ResponseEntity.status(HttpStatus.OK).body(stateService.saveAllState(statesList));
	}

	@DeleteMapping(value = "/deleteState", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteState(@RequestParam("id") Long id) {
		stateService.deleteState(id);
		return ResponseEntity.status(HttpStatus.OK).body("Record Number:" + id + " has been deleted");
	}
}
