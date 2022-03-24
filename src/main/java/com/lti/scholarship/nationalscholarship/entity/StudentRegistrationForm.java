package com.lti.scholarship.nationalscholarship.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.ToString;


@Builder
@Entity(name = "tbl_student_reg")
public class StudentRegistrationForm {

	@Id
	private Long aadharNumber;
	private String stateOfDomicile;
	private String districtOfDomicile;
	private String name;
	private String dob;
	private String gender;
	private String mobileNumber;
	private String emailId;
	private String instituteId;
	private String bankName;
	private String ifscCode;
	private long accountNumber;
	private String password;
	private String confirmPassword;
	private boolean regFormTermsAndConditions;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = AcademicDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<AcademicDetails> academicDetailsList;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = BasicDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<BasicDetails> basicDetails;
	
	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ContactDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<ContactDetails> contactDetails;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = DocumentsUpload.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<DocumentsUpload> documentsUploads;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = FeeDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<FeeDetails> feeDetails;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = IntermediateDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<IntermediateDetails> intermediateDetails;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = OtherPersonalDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<OtherPersonalDetails> otherPersonalDetails;

	@JsonManagedReference
	@ToString.Exclude
    //@JsonIgnore
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistrationForm")
	@OneToMany(cascade = CascadeType.ALL, targetEntity = TenthDetails.class)
	@JoinColumn(name = "aadhar_fk", referencedColumnName = "aadharNumber")
	private List<TenthDetails> tenthDetails;

	public StudentRegistrationForm(Long aadharNumber, String stateOfDomicile, String districtOfDomicile, String name,
			String dob, String gender, String mobileNumber, String emailId, String instituteId, String bankName,
			String ifscCode, long accountNumber, String password, String confirmPassword,
			boolean regFormTermsAndConditions, List<AcademicDetails> academicDetailsList,
			List<BasicDetails> basicDetails, List<ContactDetails> contactDetails,
			List<DocumentsUpload> documentsUploads, List<FeeDetails> feeDetails,
			List<IntermediateDetails> intermediateDetails, List<OtherPersonalDetails> otherPersonalDetails,
			List<TenthDetails> tenthDetails) {
		super();
		this.aadharNumber = aadharNumber;
		this.stateOfDomicile = stateOfDomicile;
		this.districtOfDomicile = districtOfDomicile;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.instituteId = instituteId;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.regFormTermsAndConditions = regFormTermsAndConditions;
		this.academicDetailsList = academicDetailsList;
		this.basicDetails = basicDetails;
		this.contactDetails = contactDetails;
		this.documentsUploads = documentsUploads;
		this.feeDetails = feeDetails;
		this.intermediateDetails = intermediateDetails;
		this.otherPersonalDetails = otherPersonalDetails;
		this.tenthDetails = tenthDetails;
	}
	
	public StudentRegistrationForm() {
		
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getStateOfDomicile() {
		return stateOfDomicile;
	}

	public void setStateOfDomicile(String stateOfDomicile) {
		this.stateOfDomicile = stateOfDomicile;
	}

	public String getDistrictOfDomicile() {
		return districtOfDomicile;
	}

	public void setDistrictOfDomicile(String districtOfDomicile) {
		this.districtOfDomicile = districtOfDomicile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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

	public boolean isRegFormTermsAndConditions() {
		return regFormTermsAndConditions;
	}

	public void setRegFormTermsAndConditions(boolean regFormTermsAndConditions) {
		this.regFormTermsAndConditions = regFormTermsAndConditions;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.AcademicDetails> getAcademicDetailsList() {
		return academicDetailsList;
	}

	public void setAcademicDetailsList(
			List<com.lti.scholarship.nationalscholarship.entity.AcademicDetails> academicDetailsList) {
		this.academicDetailsList = academicDetailsList;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.BasicDetails> getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(List<com.lti.scholarship.nationalscholarship.entity.BasicDetails> basicDetails) {
		this.basicDetails = basicDetails;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.ContactDetails> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<com.lti.scholarship.nationalscholarship.entity.ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.DocumentsUpload> getDocumentsUploads() {
		return documentsUploads;
	}

	public void setDocumentsUploads(List<com.lti.scholarship.nationalscholarship.entity.DocumentsUpload> documentsUploads) {
		this.documentsUploads = documentsUploads;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.FeeDetails> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<com.lti.scholarship.nationalscholarship.entity.FeeDetails> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.IntermediateDetails> getIntermediateDetails() {
		return intermediateDetails;
	}

	public void setIntermediateDetails(
			List<com.lti.scholarship.nationalscholarship.entity.IntermediateDetails> intermediateDetails) {
		this.intermediateDetails = intermediateDetails;
	}

	public List<com.lti.scholarship.nationalscholarship.entity.OtherPersonalDetails> getOtherPersonalDetails() {
		return otherPersonalDetails;
	}

	public void setOtherPersonalDetails(
			List<com.lti.scholarship.nationalscholarship.entity.OtherPersonalDetails> otherPersonalDetails) {
		this.otherPersonalDetails = otherPersonalDetails;
	}

	public List<TenthDetails> getTenthDetails() {
		return tenthDetails;
	}

	public void setTenthDetails(List<TenthDetails> tenthDetails) {
		this.tenthDetails = tenthDetails;
	}
	
	

}
