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
@Entity(name = "tbl_student_basic_details")
public class BasicDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basic_gen")
	@SequenceGenerator(name = "basic_gen", sequenceName = "basic_seq", allocationSize = 1)
	private int id;
	/*
	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	*/
	private String religion;
	private String communityOrCategory;
	private String fatherName;
	private String motherName;
	private double familyIncome;
	private String scholarShipName;
	
	public BasicDetails(int id,  String religion,
			String communityOrCategory, String fatherName, String motherName, double familyIncome, String scholarShipName) {
		super();
		this.id = id;
		this.religion = religion;
		this.communityOrCategory = communityOrCategory;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.familyIncome = familyIncome;
		this.scholarShipName = scholarShipName;
	}
	
	public BasicDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunityOrCategory() {
		return communityOrCategory;
	}

	public void setCommunityOrCategory(String communityOrCategory) {
		this.communityOrCategory = communityOrCategory;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getScholarShipName() {
		return scholarShipName;
	}

	public void setScholarShipName(String scholarShipName) {
		this.scholarShipName = scholarShipName;
	}
	
	

}
