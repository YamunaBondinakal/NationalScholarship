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
@Entity(name = "tbl_student_document_details")
public class DocumentsUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_gen")
	@SequenceGenerator(name = "document_gen", sequenceName = "document_seq", allocationSize = 1)
	private int id;
	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	
	private boolean domicileCert;
	private boolean studentPhoto;
	private boolean instituteIdCard;
	private boolean casteOrIncomeCert;
	private boolean previousYearMarkSheet;
	private boolean feeReceiptOfCurrentYear;
	private boolean bankPassbook;
	private boolean aadharCard;
	private boolean tenthMarkSheet;
	private boolean interMarkSheet;
	private boolean docTermsAndConditions;
	private int scholarShipId;
	
	public DocumentsUpload(int id, StudentRegistrationForm studentRegistrationForm, boolean domicileCert,
			boolean studentPhoto, boolean instituteIdCard, boolean casteOrIncomeCert, boolean previousYearMarkSheet,
			boolean feeReceiptOfCurrentYear, boolean bankPassbook, boolean aadharCard, boolean tenthMarkSheet,
			boolean interMarkSheet, boolean docTermsAndConditions, int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
		this.domicileCert = domicileCert;
		this.studentPhoto = studentPhoto;
		this.instituteIdCard = instituteIdCard;
		this.casteOrIncomeCert = casteOrIncomeCert;
		this.previousYearMarkSheet = previousYearMarkSheet;
		this.feeReceiptOfCurrentYear = feeReceiptOfCurrentYear;
		this.bankPassbook = bankPassbook;
		this.aadharCard = aadharCard;
		this.tenthMarkSheet = tenthMarkSheet;
		this.interMarkSheet = interMarkSheet;
		this.docTermsAndConditions = docTermsAndConditions;
		this.scholarShipId = scholarShipId;
	}
	
	public DocumentsUpload() {
		
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

	public boolean isDomicileCert() {
		return domicileCert;
	}

	public void setDomicileCert(boolean domicileCert) {
		this.domicileCert = domicileCert;
	}

	public boolean isStudentPhoto() {
		return studentPhoto;
	}

	public void setStudentPhoto(boolean studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public boolean isInstituteIdCard() {
		return instituteIdCard;
	}

	public void setInstituteIdCard(boolean instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}

	public boolean isCasteOrIncomeCert() {
		return casteOrIncomeCert;
	}

	public void setCasteOrIncomeCert(boolean casteOrIncomeCert) {
		this.casteOrIncomeCert = casteOrIncomeCert;
	}

	public boolean isPreviousYearMarkSheet() {
		return previousYearMarkSheet;
	}

	public void setPreviousYearMarkSheet(boolean previousYearMarkSheet) {
		this.previousYearMarkSheet = previousYearMarkSheet;
	}

	public boolean isFeeReceiptOfCurrentYear() {
		return feeReceiptOfCurrentYear;
	}

	public void setFeeReceiptOfCurrentYear(boolean feeReceiptOfCurrentYear) {
		this.feeReceiptOfCurrentYear = feeReceiptOfCurrentYear;
	}

	public boolean isBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(boolean bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public boolean isAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(boolean aadharCard) {
		this.aadharCard = aadharCard;
	}

	public boolean isTenthMarkSheet() {
		return tenthMarkSheet;
	}

	public void setTenthMarkSheet(boolean tenthMarkSheet) {
		this.tenthMarkSheet = tenthMarkSheet;
	}

	public boolean isInterMarkSheet() {
		return interMarkSheet;
	}

	public void setInterMarkSheet(boolean interMarkSheet) {
		this.interMarkSheet = interMarkSheet;
	}

	public boolean isDocTermsAndConditions() {
		return docTermsAndConditions;
	}

	public void setDocTermsAndConditions(boolean docTermsAndConditions) {
		this.docTermsAndConditions = docTermsAndConditions;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}

	
	
}
