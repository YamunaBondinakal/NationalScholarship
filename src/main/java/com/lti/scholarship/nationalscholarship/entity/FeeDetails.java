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
    /*
	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
    */
	private double admissionFee;
	private double tuitionFee;
	private double otherFee;
	private String scholarShipName;
	
	public FeeDetails(int id, double admissionFee, double tuitionFee,
			double otherFee, String scholarShipName) {
		super();
		this.id = id;
		this.admissionFee = admissionFee;
		this.tuitionFee = tuitionFee;
		this.otherFee = otherFee;
		this.scholarShipName = scholarShipName;
	}
	
	public FeeDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getScholarShipName() {
		return scholarShipName;
	}

	public void setScholarShipName(String scholarShipName) {
		this.scholarShipName = scholarShipName;
	}
	
	

}
