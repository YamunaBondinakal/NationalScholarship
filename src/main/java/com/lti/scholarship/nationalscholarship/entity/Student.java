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
@Table(name = "tbl_student")
public class Student 
{
	@Id
	@Column(name = "student_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
	@SequenceGenerator(name="student_gen", sequenceName = "student_seq", allocationSize=1)
	private int id;

	@Column(name = "student_Name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mobile_Number")
	private String mobNum;

	@Column(name = "email")
	private String email;

	@Column(name = "institution_Code")
	private String institutionCode;

	@Column(name = "aadhar_Num")
	private int aadharNum;

	@Column(name = "state_Of_Domicile")
	private String stateOfDomicile;

	@Column(name = "password")
	private String password;

	@Column(name = "confirm_Password")
	private String confirmPassword;

	public Student(String name, String gender, String mobNum, String email, String institutionCode, int aadharNum,
			String stateOfDomicile, String password, String confirmPassword) {
		super();
		this.name = name;
		this.gender = gender;
		this.mobNum = mobNum;
		this.email = email;
		this.institutionCode = institutionCode;
		this.aadharNum = aadharNum;
		this.stateOfDomicile = stateOfDomicile;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public Student()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public int getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(int aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getStateOfDomicile() {
		return stateOfDomicile;
	}

	public void setStateOfDomicile(String stateOfDomicile) {
		this.stateOfDomicile = stateOfDomicile;
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