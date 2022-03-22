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
@Entity(name = "tbl_student_inter_details")
public class IntermediateDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inter_gen")
	@SequenceGenerator(name = "inter_gen", sequenceName = "inter_seq", allocationSize = 1)
	private int id;

	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;

	private String interRollNumber;
	private String interBoardName;
	private int interPassingYear;
	private double interPercentageObtained;
	private int scholarShipId;
	
	public IntermediateDetails(int id, StudentRegistrationForm studentRegistrationForm, String interRollNumber,
			String interBoardName, int interPassingYear, double interPercentageObtained, int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
		this.interRollNumber = interRollNumber;
		this.interBoardName = interBoardName;
		this.interPassingYear = interPassingYear;
		this.interPercentageObtained = interPercentageObtained;
		this.scholarShipId = scholarShipId;
	}
	
	public IntermediateDetails() {
		
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

	public String getInterRollNumber() {
		return interRollNumber;
	}

	public void setInterRollNumber(String interRollNumber) {
		this.interRollNumber = interRollNumber;
	}

	public String getInterBoardName() {
		return interBoardName;
	}

	public void setInterBoardName(String interBoardName) {
		this.interBoardName = interBoardName;
	}

	public int getInterPassingYear() {
		return interPassingYear;
	}

	public void setInterPassingYear(int interPassingYear) {
		this.interPassingYear = interPassingYear;
	}

	public double getInterPercentageObtained() {
		return interPercentageObtained;
	}

	public void setInterPercentageObtained(double interPercentageObtained) {
		this.interPercentageObtained = interPercentageObtained;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}
	
	

}
