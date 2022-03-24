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
@Entity(name = "tbl_student_tenth_details")
public class TenthDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tenth_gen")
	@SequenceGenerator(name = "tenth_gen", sequenceName = "tenth_seq", allocationSize = 1)
	private int id;
	/*
	 * @JsonBackReference
	 * 
	 * @ToString.Exclude
	 * 
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "aadharNumber") private StudentRegistrationForm
	 * studentRegistrationForm;
	 */
	private String sscRollNumber;
	private String sscBoardName;
	private int sscPassingYear;
	private double sscPercentageObtained;
	private String scholarShipName;

	public TenthDetails(int id, String sscRollNumber, String sscBoardName, int sscPassingYear,
			double sscPercentageObtained, String scholarShipName) {
		super();
		this.id = id;
		this.sscRollNumber = sscRollNumber;
		this.sscBoardName = sscBoardName;
		this.sscPassingYear = sscPassingYear;
		this.sscPercentageObtained = sscPercentageObtained;
		this.scholarShipName = scholarShipName;
	}

	public TenthDetails() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSscRollNumber() {
		return sscRollNumber;
	}

	public void setSscRollNumber(String sscRollNumber) {
		this.sscRollNumber = sscRollNumber;
	}

	public String getSscBoardName() {
		return sscBoardName;
	}

	public void setSscBoardName(String sscBoardName) {
		this.sscBoardName = sscBoardName;
	}

	public int getSscPassingYear() {
		return sscPassingYear;
	}

	public void setSscPassingYear(int sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}

	public double getSscPercentageObtained() {
		return sscPercentageObtained;
	}

	public void setSscPercentageObtained(double sscPercentageObtained) {
		this.sscPercentageObtained = sscPercentageObtained;
	}

	public String getScholarShipName() {
		return scholarShipName;
	}

	public void setScholarShipName(String scholarShipName) {
		this.scholarShipName = scholarShipName;
	}

}
