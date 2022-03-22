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
@Entity(name = "tbl_student_other_details")
public class OtherPersonalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "other_gen")
	@SequenceGenerator(name = "other_gen", sequenceName = "other_seq", allocationSize = 1)
	private int id;

	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	
	private boolean isDisabled;
	private String typeOfDisability;
	private double percentageOfDisability;
	private String maritalStatus;
	private String parentsProfession;
	private int scholarShipId;
	
	public OtherPersonalDetails(int id, StudentRegistrationForm studentRegistrationForm, boolean isDisabled,
			String typeOfDisability, double percentageOfDisability, String maritalStatus, String parentsProfession,
			int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
		this.isDisabled = isDisabled;
		this.typeOfDisability = typeOfDisability;
		this.percentageOfDisability = percentageOfDisability;
		this.maritalStatus = maritalStatus;
		this.parentsProfession = parentsProfession;
		this.scholarShipId = scholarShipId;
	}
	
	public OtherPersonalDetails() {
		
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

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getTypeOfDisability() {
		return typeOfDisability;
	}

	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public double getPercentageOfDisability() {
		return percentageOfDisability;
	}

	public void setPercentageOfDisability(double percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getParentsProfession() {
		return parentsProfession;
	}

	public void setParentsProfession(String parentsProfession) {
		this.parentsProfession = parentsProfession;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}
	
	

}