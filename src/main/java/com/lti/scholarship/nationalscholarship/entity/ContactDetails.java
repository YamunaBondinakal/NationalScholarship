package com.lti.scholarship.nationalscholarship.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import lombok.Builder;
import lombok.ToString;


@Builder
@Entity(name = "tbl_student_contact_details")
public class ContactDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_gen")
	@SequenceGenerator(name = "contact_gen", sequenceName = "contact_seq", allocationSize = 1)
	private int id;
	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	private String state;
	private String district;
	private String blockOrTaluka;
	private String houseNumber;
	private String streetNumber;
	private int pinCode;
	private int scholarShipId;
	
	public ContactDetails(int id, StudentRegistrationForm studentRegistrationForm, String state, String district,
			String blockOrTaluka, String houseNumber, String streetNumber, int pinCode, int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
		this.state = state;
		this.district = district;
		this.blockOrTaluka = blockOrTaluka;
		this.houseNumber = houseNumber;
		this.streetNumber = streetNumber;
		this.pinCode = pinCode;
		this.scholarShipId = scholarShipId;
	}
	
	public ContactDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentRegistrationForm getStudentRegistrationForm() {
		return studentRegistrationForm;
	}

	public void setStudentRegistrationForm(StudentRegistrationForm studentRegistrationForm) {
		this.studentRegistrationForm = studentRegistrationForm;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockOrTaluka() {
		return blockOrTaluka;
	}

	public void setBlockOrTaluka(String blockOrTaluka) {
		this.blockOrTaluka = blockOrTaluka;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}
	
	

}
