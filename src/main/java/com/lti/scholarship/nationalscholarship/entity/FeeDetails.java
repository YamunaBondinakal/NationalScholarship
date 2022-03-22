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
@Entity(name = "tbl_student_fee_details")
public class FeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fee_gen")
	@SequenceGenerator(name = "fee_gen", sequenceName = "fee_seq", allocationSize = 1)
	private int id;

	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;

	private double admissionFee;
	private double tuitionFee;
	private double otherFee;
	private int scholarShipId;
	
	public FeeDetails(int id, StudentRegistrationForm studentRegistrationForm, double admissionFee, double tuitionFee,
			double otherFee, int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
		this.admissionFee = admissionFee;
		this.tuitionFee = tuitionFee;
		this.otherFee = otherFee;
		this.scholarShipId = scholarShipId;
	}
	
	public FeeDetails() {
		
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

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}
	
	

}
