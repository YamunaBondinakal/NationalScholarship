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
@Table(name = "tbl_institute")
public class Institute {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	 * "institute_gen")
	 * 
	 * @SequenceGenerator(name="institute_gen", sequenceName = "institute_seq",
	 * allocationSize=1)
	 * 
	 * @Column(name = "institute_Id") private int id;
	 */

	@Id
	@Column(name = "aadhar_Number")
	private Long aadharNumber;

	@Column(name = "institute_Name")
	private String institutionName;

	@Column(name = "institute_Code")
	private String institutionCode;

	@Column(name = "dise_Code")
	private String diseCode;

	@Column(name = "state_Name")
	private String stateName;

	@Column(name = "university_State")
	private String universityState;

	@Column(name = "university_Name")
	private String univercityName;

	@Column(name = "institute_Est_Cert")
	private String instituteEstablishmentCertificate;

	@Column(name = "university_Board_Affil_Cert")
	private String universityBoardAffiliationCertificate;

	@Column(name = "password")
	private String password;

	@Column(name = "confirm_Password")
	private String confirmPassword;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(Long aadharNumber, String institutionName, String institutionCode, String diseCode,
			String stateName, String universityState, String univercityName, String instituteEstablishmentCertificate,
			String universityBoardAffiliationCertificate, String password, String confirmPassword) {
		super();
		this.aadharNumber = aadharNumber;
		this.institutionName = institutionName;
		this.institutionCode = institutionCode;
		this.diseCode = diseCode;
		this.stateName = stateName;
		this.universityState = universityState;
		this.univercityName = univercityName;
		this.instituteEstablishmentCertificate = instituteEstablishmentCertificate;
		this.universityBoardAffiliationCertificate = universityBoardAffiliationCertificate;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public String getUnivercityName() {
		return univercityName;
	}

	public void setUnivercityName(String univercityName) {
		this.univercityName = univercityName;
	}

	public String getInstituteEstablishmentCertificate() {
		return instituteEstablishmentCertificate;
	}

	public void setInstituteEstablishmentCertificate(String instituteEstablishmentCertificate) {
		this.instituteEstablishmentCertificate = instituteEstablishmentCertificate;
	}

	public String getUniversityBoardAffiliationCertificate() {
		return universityBoardAffiliationCertificate;
	}

	public void setUniversityBoardAffiliationCertificate(String universityBoardAffiliationCertificate) {
		this.universityBoardAffiliationCertificate = universityBoardAffiliationCertificate;
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
