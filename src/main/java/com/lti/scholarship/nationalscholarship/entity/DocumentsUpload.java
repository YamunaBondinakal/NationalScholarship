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
	/*
	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	*/
	private String domicileCert;
	private String studentPhoto;
	private String instituteIdCard;
	private String casteOrIncomeCert;
	private String previousYearMarkSheet;
	private String feeReceiptOfCurrentYear;
	private String bankPassbook;
	private String aadharCard;
	private String tenthMarkSheet;
	private String interMarkSheet;
	private boolean docTermsAndConditions;
	private String scholarShipName;
	
	public DocumentsUpload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentsUpload(int id,  String domicileCert,
			String studentPhoto, String instituteIdCard, String casteOrIncomeCert, String previousYearMarkSheet,
			String feeReceiptOfCurrentYear, String bankPassbook, String aadharCard, String tenthMarkSheet,
			String interMarkSheet, boolean docTermsAndConditions, String scholarShipName) {
		super();
		this.id = id;
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
		this.scholarShipName = scholarShipName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDomicileCert() {
		return domicileCert;
	}
	public void setDomicileCert(String domicileCert) {
		this.domicileCert = domicileCert;
	}
	public String getStudentPhoto() {
		return studentPhoto;
	}
	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
	}
	public String getInstituteIdCard() {
		return instituteIdCard;
	}
	public void setInstituteIdCard(String instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}
	public String getCasteOrIncomeCert() {
		return casteOrIncomeCert;
	}
	public void setCasteOrIncomeCert(String casteOrIncomeCert) {
		this.casteOrIncomeCert = casteOrIncomeCert;
	}
	public String getPreviousYearMarkSheet() {
		return previousYearMarkSheet;
	}
	public void setPreviousYearMarkSheet(String previousYearMarkSheet) {
		this.previousYearMarkSheet = previousYearMarkSheet;
	}
	public String getFeeReceiptOfCurrentYear() {
		return feeReceiptOfCurrentYear;
	}
	public void setFeeReceiptOfCurrentYear(String feeReceiptOfCurrentYear) {
		this.feeReceiptOfCurrentYear = feeReceiptOfCurrentYear;
	}
	public String getBankPassbook() {
		return bankPassbook;
	}
	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getTenthMarkSheet() {
		return tenthMarkSheet;
	}
	public void setTenthMarkSheet(String tenthMarkSheet) {
		this.tenthMarkSheet = tenthMarkSheet;
	}
	public String getInterMarkSheet() {
		return interMarkSheet;
	}
	public void setInterMarkSheet(String interMarkSheet) {
		this.interMarkSheet = interMarkSheet;
	}
	public boolean isDocTermsAndConditions() {
		return docTermsAndConditions;
	}
	public void setDocTermsAndConditions(boolean docTermsAndConditions) {
		this.docTermsAndConditions = docTermsAndConditions;
	}
	public String getScholarShipName() {
		return scholarShipName;
	}
	public void setScholarShipName(String scholarShipName) {
		this.scholarShipName = scholarShipName;
	}
	
		
}
