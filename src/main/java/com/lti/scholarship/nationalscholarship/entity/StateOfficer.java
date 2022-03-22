package com.lti.scholarship.nationalscholarship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_state_officer")
public class StateOfficer {
	/*
	 * @Id
	 * 
	 * @Column(name = "state_Id")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_gen")
	 * 
	 * @SequenceGenerator(name = "state_gen", sequenceName = "state_seq",
	 * allocationSize = 1) private int id;
	 */

	@Id
	@Column(name = "aadhar_Number")
	private Long aadharNumber;

	@Column(name = "state_Name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mob_Num")
	private String mobNum;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "confirm_Password")
	private String confirmPassword;

	public StateOfficer(String name, String gender, String mobNum, String email, Long aadharNumber, String password,
			String confirmPassword) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.gender = gender;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public StateOfficer() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNum(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}