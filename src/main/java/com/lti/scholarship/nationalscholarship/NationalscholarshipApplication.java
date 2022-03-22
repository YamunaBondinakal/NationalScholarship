package com.lti.scholarship.nationalscholarship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.lti.scholarship.nationalscholarship.entity.AcademicDetails;
import com.lti.scholarship.nationalscholarship.entity.BasicDetails;
import com.lti.scholarship.nationalscholarship.entity.ContactDetails;
import com.lti.scholarship.nationalscholarship.entity.DocumentsUpload;
import com.lti.scholarship.nationalscholarship.entity.FeeDetails;
import com.lti.scholarship.nationalscholarship.entity.Institute;
import com.lti.scholarship.nationalscholarship.entity.IntermediateDetails;
import com.lti.scholarship.nationalscholarship.entity.MinistryOfficer;
import com.lti.scholarship.nationalscholarship.entity.OtherPersonalDetails;
import com.lti.scholarship.nationalscholarship.entity.StateOfficer;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.entity.TenthDetails;
import com.lti.scholarship.nationalscholarship.repository.InstituteRepository;
import com.lti.scholarship.nationalscholarship.repository.MinistryRepository;
import com.lti.scholarship.nationalscholarship.repository.StateRepository;
import com.lti.scholarship.nationalscholarship.repository.StudentRegistrationRepository;
import com.lti.scholarship.nationalscholarship.repository.StudentRepository;

@SpringBootApplication
@EnableJpaRepositories
public class NationalscholarshipApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private InstituteRepository instituteRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private MinistryRepository ministryRepository;

	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;

	public static void main(String[] args) {
		SpringApplication.run(NationalscholarshipApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student = new Student(); student.setName("Yamuna");
		 * student.setGender("Female"); student.setMobNum("9876543210");
		 * student.setEmail("Yamuna27@gmail.com"); student.setInstitutionCode("Lti123");
		 * student.setAadharNum(123456); student.setStateOfDomicile("Ap");
		 * student.setPassword("Yamuna@123"); student.setConfirmPassword("Yamuna@123");
		 * studentRepository.save(student);
		 * 
		 * System.out.println("Student object has been inserted==========>");
		 */
		/*
		Institute institute = new Institute();
		institute.setAadharNumber((long) 21293326);
		institute.setInstitutionName("Lti");
		institute.setInstitutionCode("Lti123");
		institute.setDiseCode("Lnt657");
		institute.setStateName("Ap");
		institute.setUniversityState("Karnataka");
		institute.setUnivercityName("Jntua");
		institute.setInstituteEstablishmentCertificate("Ins_Cert");
		institute.setUniversityBoardAffiliationCertificate("Universirt_Cert");
		institute.setPassword("Yamuna@2000");
		institute.setConfirmPassword("Yamuna@2000");
		instituteRepository.save(institute);

		System.out.println("Institute object has been inserted========>");

		StateOfficer stateOfficer = new StateOfficer();
		stateOfficer.setName("Ap");
		stateOfficer.setGender("Female");
		stateOfficer.setMobNum("9876543211");
		stateOfficer.setEmail("Yamuna27@gmail.com");
		stateOfficer.setAadharNum((long) 98765);
		stateOfficer.setPassword("Yamuna@2000");
		stateOfficer.setConfirmPassword("Yamuna@2000");
		stateRepository.save(stateOfficer);

		System.out.println("State object has been inserted");

		MinistryOfficer ministryOfficer = new MinistryOfficer();
		ministryOfficer.setName("Anusha");
		ministryOfficer.setGender("Female");
		ministryOfficer.setMobNum("9876543212");
		ministryOfficer.setEmail("Anusha27@gmail.com");
		ministryOfficer.setAadharNumber((long) 12345);
		ministryOfficer.setPassword("Anu@27");
		ministryOfficer.setConfirmPassword("Anu@27");
		ministryRepository.save(ministryOfficer);

		System.out.println("Ministry object has been inserted");

		Long aadharNumber = Long.valueOf(123456);

		StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();

		studentRegistrationForm.setAadharNumber(aadharNumber);
		studentRegistrationForm.setBankName("SBI");
		studentRegistrationForm.setAccountNumber(1234);
		studentRegistrationForm.setEmailId("siva@gamil.com");
		studentRegistrationForm.setDistrictOfDomicile("kurnool");
		studentRegistrationForm.setGender("Male");
		studentRegistrationForm.setDob("April");
		studentRegistrationForm.setPassword("sivaji");
		studentRegistrationForm.setConfirmPassword("sivaji");
		studentRegistrationForm.setIfscCode("SBIN");
		studentRegistrationForm.setName("Siva");
		studentRegistrationForm.setMobileNumber("12345678");
		studentRegistrationForm.setInstituteId("123456");

		// academic insert

		AcademicDetails academicDetails = new AcademicDetails();

		academicDetails.setClassStartDate("March");
		academicDetails.setInstituteName("ST.JOHNS");
		academicDetails.setModeOfStudy("Regular");
		academicDetails.setScholarShipId(1234);
		academicDetails.setPresentClassOrCourse("BTech");
		academicDetails.setPresentClassOrCourseYear(4);
		academicDetails.setPreviousClassCourse("Inter");
		academicDetails.setPreviousPassingYear(2018);
		academicDetails.setPreviousPercentage(23.4);
		academicDetails.setPresentClassOrCourseYear(4);
		academicDetails.setPresentClassOrCourse("Bte");
		academicDetails.setScholarShipId(12);

		// setting to studentform

		studentRegistrationForm.getAcademicDetailsList().add(academicDetails);

		// basic form
		BasicDetails basicDetails = new BasicDetails();
		basicDetails.setFamilyIncome(480000.00);
		basicDetails.setFatherName("Venu");
		basicDetails.setMotherName("Sumitra");
		basicDetails.setReligion("Hindu");
		basicDetails.setCommunityOrCategory("OBC");
		basicDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getBasicDetails().add(basicDetails);

		// contactDetails
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setDistrict("Kurnool");
		contactDetails.setBlockOrTaluka("Adoni");
		contactDetails.setHouseNumber("1/140A");
		contactDetails.setPinCode(518301);
		contactDetails.setState("Ap");
		contactDetails.setStreetNumber("RsColony");
		contactDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getContactDetails().add(contactDetails);

		// documentsUpload
		DocumentsUpload documentsUpload = new DocumentsUpload();
		documentsUpload.setAadharCard(true);
		documentsUpload.setBankPassbook(true);
		;
		documentsUpload.setDomicileCert(true);
		documentsUpload.setCasteOrIncomeCert(true);
		documentsUpload.setStudentPhoto(true);
		documentsUpload.setInstituteIdCard(true);
		documentsUpload.setInterMarkSheet(true);
		documentsUpload.setFeeReceiptOfCurrentYear(true);
		documentsUpload.setTenthMarkSheet(true);
		documentsUpload.setPreviousYearMarkSheet(true);
		documentsUpload.setDocTermsAndConditions(true);
		documentsUpload.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getDocumentsUploads().add(documentsUpload);

		// feeDetails
		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setAdmissionFee(98760.00);
		feeDetails.setTuitionFee(10000.00);
		feeDetails.setOtherFee(9890.00);
		feeDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getFeeDetails().add(feeDetails);

		// interDetails
		IntermediateDetails intermediateDetails = new IntermediateDetails();
		intermediateDetails.setInterBoardName("Jntua");
		intermediateDetails.setInterPassingYear(2021);
		intermediateDetails.setInterPercentageObtained(81);
		intermediateDetails.setInterRollNumber("17g31");
		intermediateDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getIntermediateDetails().add(intermediateDetails);

		// otherPersonalDetails

		OtherPersonalDetails otherPersonalDetails = new OtherPersonalDetails();
		otherPersonalDetails.setDisabled(false);
		otherPersonalDetails.setMaritalStatus("Unmarried");
		otherPersonalDetails.setParentsProfession("Agriculture");
		otherPersonalDetails.setTypeOfDisability("No");
		otherPersonalDetails.setPercentageOfDisability(0.00);
		otherPersonalDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getOtherPersonalDetails().add(otherPersonalDetails);

		// tenthDetails
		TenthDetails tenthDetails = new TenthDetails();
		tenthDetails.setSscBoardName("SSC");
		tenthDetails.setSscPassingYear(2021);
		tenthDetails.setSscPercentageObtained(70);
		tenthDetails.setSscRollNumber("17G31");
		tenthDetails.setScholarShipId(12);

		// setting to studentform
		studentRegistrationForm.getTenthDetails().add(tenthDetails);


		academicDetails.setStudentRegistrationForm(studentRegistrationForm);
		basicDetails.setStudentRegistrationForm(studentRegistrationForm);
		contactDetails.setStudentRegistrationForm(studentRegistrationForm);
		documentsUpload.setStudentRegistrationForm(studentRegistrationForm);
		feeDetails.setStudentRegistrationForm(studentRegistrationForm);
		intermediateDetails.setStudentRegistrationForm(studentRegistrationForm);
		otherPersonalDetails.setStudentRegistrationForm(studentRegistrationForm);
		tenthDetails.setStudentRegistrationForm(studentRegistrationForm);
		System.out.println("=================>Before saving:");
		StudentRegistrationForm entity = studentRegistrationRepository.save(studentRegistrationForm);

		System.out.println("2nd Record started saving=============================>");

		Long aadharNumber1 = Long.valueOf(12345678);

		StudentRegistrationForm studentRegistrationForm1 = new StudentRegistrationForm();
		studentRegistrationForm1.setAadharNumber(aadharNumber1);
		studentRegistrationForm1.setBankName("SBI");
		studentRegistrationForm1.setAccountNumber(1234);
		studentRegistrationForm1.setEmailId("siva@gamil.com");
		studentRegistrationForm1.setDistrictOfDomicile("kurnool");
		studentRegistrationForm1.setGender("Male");
		studentRegistrationForm1.setDob("April");
		studentRegistrationForm1.setPassword("sivaji");
		studentRegistrationForm1.setConfirmPassword("sivaji");
		studentRegistrationForm1.setIfscCode("SBIN");
		studentRegistrationForm1.setName("Siva");
		studentRegistrationForm1.setMobileNumber("12345678");
		studentRegistrationForm1.setInstituteId("123456");

		// academic insert
		AcademicDetails academicDetails1 = new AcademicDetails();
		academicDetails1.setClassStartDate("March");
		academicDetails1.setInstituteName("ST.JOHNS");
		academicDetails1.setModeOfStudy("Regular");
		academicDetails1.setScholarShipId(123);
		academicDetails1.setPresentClassOrCourse("BTech");
		academicDetails1.setPresentClassOrCourseYear(4);
		academicDetails1.setPreviousClassCourse("Inter");
		academicDetails1.setPreviousPassingYear(2018);
		academicDetails1.setPreviousPercentage(23.4);
		academicDetails1.setPresentClassOrCourseYear(4);
		academicDetails1.setPresentClassOrCourse("Bte");

		// setting to studentform
		studentRegistrationForm1.getAcademicDetailsList().add(academicDetails1);

		// basic form
		BasicDetails basicDetails1 = new BasicDetails();
		basicDetails1.setFamilyIncome(480000.00);
		basicDetails1.setFatherName("Venu");
		basicDetails1.setMotherName("Sumitra");
		basicDetails1.setReligion("Hindu");
		basicDetails1.setCommunityOrCategory("OBC");
		basicDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getBasicDetails().add(basicDetails1);

		// contactDetails
		ContactDetails contactDetails1 = new ContactDetails();
		contactDetails1.setDistrict("Kurnool");
		contactDetails1.setBlockOrTaluka("Adoni");
		contactDetails1.setHouseNumber("1/140A");
		contactDetails1.setPinCode(518301);
		contactDetails1.setState("Ap");
		contactDetails1.setStreetNumber("RsColony");
		contactDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getContactDetails().add(contactDetails1);

		// documentsUpload
		DocumentsUpload documentsUpload1 = new DocumentsUpload();
		documentsUpload1.setAadharCard(true);
		documentsUpload1.setBankPassbook(true);
		;
		documentsUpload1.setDomicileCert(true);
		documentsUpload1.setCasteOrIncomeCert(true);
		documentsUpload1.setStudentPhoto(true);
		documentsUpload1.setInstituteIdCard(true);
		documentsUpload1.setInterMarkSheet(true);
		documentsUpload1.setFeeReceiptOfCurrentYear(true);
		documentsUpload1.setTenthMarkSheet(true);
		documentsUpload1.setPreviousYearMarkSheet(true);
		documentsUpload1.setDocTermsAndConditions(true);
		documentsUpload1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getDocumentsUploads().add(documentsUpload1);

		// feeDetails
		FeeDetails feeDetails1 = new FeeDetails();
		feeDetails1.setAdmissionFee(98760.00);
		feeDetails1.setTuitionFee(10000.00);
		feeDetails1.setOtherFee(9890.00);
		feeDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getFeeDetails().add(feeDetails1);

		// interDetails
		IntermediateDetails intermediateDetails1 = new IntermediateDetails();
		intermediateDetails1.setInterBoardName("Jntua");
		intermediateDetails1.setInterPassingYear(2021);
		intermediateDetails1.setInterPercentageObtained(81);
		intermediateDetails1.setInterRollNumber("17g31");
		intermediateDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getIntermediateDetails().add(intermediateDetails1);

		// otherPersonalDetails
		OtherPersonalDetails otherPersonalDetails1 = new OtherPersonalDetails();
		otherPersonalDetails1.setDisabled(false);
		otherPersonalDetails1.setMaritalStatus("Unmarried");
		otherPersonalDetails1.setParentsProfession("Agriculture");
		otherPersonalDetails1.setTypeOfDisability("No");
		otherPersonalDetails1.setPercentageOfDisability(0.00);
		otherPersonalDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getOtherPersonalDetails().add(otherPersonalDetails1);

		// tenthDetails
		TenthDetails tenthDetails1 = new TenthDetails();
		tenthDetails1.setSscBoardName("SSC");
		tenthDetails1.setSscPassingYear(2021);
		tenthDetails1.setSscPercentageObtained(70);
		tenthDetails1.setSscRollNumber("17G31");
		tenthDetails1.setScholarShipId(123);

		// setting to studentform
		studentRegistrationForm1.getTenthDetails().add(tenthDetails1);

		academicDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		basicDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		contactDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		documentsUpload1.setStudentRegistrationForm(studentRegistrationForm1);
		feeDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		intermediateDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		otherPersonalDetails1.setStudentRegistrationForm(studentRegistrationForm1);
		tenthDetails1.setStudentRegistrationForm(studentRegistrationForm1);

		System.out.println("=================>Before saving:");

		StudentRegistrationForm entity1 = studentRegistrationRepository.save(studentRegistrationForm1);

		System.out.println("2nd recored saved=====================================>");
		*/

	}

}