package com.lti.scholarship.nationalscholarship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Builder;

@Builder
@Entity(name = "tbl_scholarship_details")
public class ScholarShipDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scholarship_gen")
	@SequenceGenerator(name = "scholarship_gen", sequenceName = "scholarship_seq", allocationSize = 1)
	private int scholarShipId;

	private String scholarShipName;
	private boolean isActive;
	public ScholarShipDetails(int scholarShipId, String scholarShipName, boolean isActive) {
		super();
		this.scholarShipId = scholarShipId;
		this.scholarShipName = scholarShipName;
		this.isActive = isActive;
	}
	
	public ScholarShipDetails() {
		
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}

	public String getScholarShipName() {
		return scholarShipName;
	}

	public void setScholarShipName(String scholarShipName) {
		this.scholarShipName = scholarShipName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "ScholarShipDetails [scholarShipId=" + scholarShipId + ", scholarShipName=" + scholarShipName
				+ ", isActive=" + isActive + "]";
	}
	
	

}
