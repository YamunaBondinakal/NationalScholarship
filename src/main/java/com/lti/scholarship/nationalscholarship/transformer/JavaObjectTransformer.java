package com.lti.scholarship.nationalscholarship.transformer;

import java.util.Arrays;

import com.lti.scholarship.nationalscholarship.dto.studentregform.StudentRegistrationFormDTO;
import com.lti.scholarship.nationalscholarship.entity.AcademicDetails;
import com.lti.scholarship.nationalscholarship.entity.BasicDetails;
import com.lti.scholarship.nationalscholarship.entity.ContactDetails;
import com.lti.scholarship.nationalscholarship.entity.DocumentsUpload;
import com.lti.scholarship.nationalscholarship.entity.FeeDetails;
import com.lti.scholarship.nationalscholarship.entity.IntermediateDetails;
import com.lti.scholarship.nationalscholarship.entity.OtherPersonalDetails;
import com.lti.scholarship.nationalscholarship.entity.StudentRegistrationForm;
import com.lti.scholarship.nationalscholarship.entity.TenthDetails;

public class JavaObjectTransformer {

	public static StudentRegistrationForm buildAndGetStudentEntityByDTO(

			StudentRegistrationFormDTO studentRegistrationFormDTO) {

		StudentRegistrationForm registrationForm = new StudentRegistrationForm();
		registrationForm.setAadharNumber(studentRegistrationFormDTO.getAadharNumber());
		registrationForm.setStateOfDomicile(studentRegistrationFormDTO.getStateOfDomicile());
		registrationForm.setDistrictOfDomicile(studentRegistrationFormDTO.getDistrictOfDomicile());
		registrationForm.setName(studentRegistrationFormDTO.getName());
		registrationForm.setDob(studentRegistrationFormDTO.getDob());
		registrationForm.setGender(studentRegistrationFormDTO.getGender());
		registrationForm.setMobileNumber(studentRegistrationFormDTO.getMobileNumber());
		registrationForm.setEmailId(studentRegistrationFormDTO.getEmailId());
		registrationForm.setInstituteId(studentRegistrationFormDTO.getInstituteId());
		registrationForm.setBankName(studentRegistrationFormDTO.getBankName());
		registrationForm.setIfscCode(studentRegistrationFormDTO.getIfscCode());
		registrationForm.setAccountNumber(studentRegistrationFormDTO.getAccountNumber());
		registrationForm.setPassword(studentRegistrationFormDTO.getPassword());
		registrationForm.setConfirmPassword(studentRegistrationFormDTO.getConfirmPassword());
		registrationForm.setRegFormTermsAndConditions(studentRegistrationFormDTO.isRegFormTermsAndConditions());
		
		
				

		AcademicDetails academicDetails = new AcademicDetails();
		academicDetails.setInstituteName(studentRegistrationFormDTO.getInstituteName());
		academicDetails.setPresentClassOrCourse(studentRegistrationFormDTO.getPresentClassOrCourse());
		academicDetails.setPresentClassOrCourseYear(studentRegistrationFormDTO.getPresentClassOrCourseYear());
		academicDetails.setModeOfStudy(studentRegistrationFormDTO.getModeOfStudy());
		academicDetails.setClassStartDate(studentRegistrationFormDTO.getClassStartDate());
		academicDetails.setUniversityOrBoardName(studentRegistrationFormDTO.getUniversityOrBoardName());
		academicDetails.setPreviousClassCourse(studentRegistrationFormDTO.getPreviousClassCourse());
		academicDetails.setPreviousPassingYear(studentRegistrationFormDTO.getPreviousPassingYear());
		academicDetails.setPreviousPercentage(studentRegistrationFormDTO.getPreviousPercentage());
		academicDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
				

		BasicDetails basicDetails = new BasicDetails();
		basicDetails.setReligion(studentRegistrationFormDTO.getReligion());
		basicDetails.setCommunityOrCategory(studentRegistrationFormDTO.getCommunityOrCategory());
		basicDetails.setFatherName(studentRegistrationFormDTO.getFatherName());
		basicDetails.setMotherName(studentRegistrationFormDTO.getMotherName());
		basicDetails.setFamilyIncome(studentRegistrationFormDTO.getFamilyIncome());
		basicDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
	
	   ContactDetails contactDetails =new ContactDetails();
	   contactDetails.setState(studentRegistrationFormDTO.getState());
	   contactDetails.setDistrict(studentRegistrationFormDTO.getDistrict());
	   contactDetails.setBlockOrTaluka(studentRegistrationFormDTO.getBlockOrTaluka());
	   contactDetails.setHouseNumber(studentRegistrationFormDTO.getHouseNumber());
	   contactDetails.setStreetNumber(studentRegistrationFormDTO.getStreetNumber());
	   contactDetails.setPinCode(studentRegistrationFormDTO.getPinCode());
	   contactDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
	   
	   DocumentsUpload documentsUploads =new DocumentsUpload();
	   documentsUploads.setDomicileCert(studentRegistrationFormDTO.getDomicileCert());
	   documentsUploads.setStudentPhoto(studentRegistrationFormDTO.getStudentPhoto());
	   documentsUploads.setInstituteIdCard(studentRegistrationFormDTO.getInstituteIdCard());
	   documentsUploads.setCasteOrIncomeCert(studentRegistrationFormDTO.getCasteOrIncomeCert());
	   documentsUploads.setPreviousYearMarkSheet(studentRegistrationFormDTO.getPreviousYearMarkSheet());
	   documentsUploads.setFeeReceiptOfCurrentYear(studentRegistrationFormDTO.getFeeReceiptOfCurrentYear());
	   documentsUploads.setBankPassbook(studentRegistrationFormDTO.getBankPassbook());
	   documentsUploads.setAadharCard(studentRegistrationFormDTO.getAadharCard());
	   documentsUploads.setTenthMarkSheet(studentRegistrationFormDTO.getTenthMarkSheet());
	   documentsUploads.setInterMarkSheet(studentRegistrationFormDTO.getInterMarkSheet());
	   documentsUploads.setDocTermsAndConditions(studentRegistrationFormDTO.isDocTermsAndConditions());
	   documentsUploads.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
	   
		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setAdmissionFee(studentRegistrationFormDTO.getAdmissionFee());
		feeDetails.setTuitionFee(studentRegistrationFormDTO.getTuitionFee());
		feeDetails.setOtherFee(studentRegistrationFormDTO.getOtherFee());
		feeDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
		
		IntermediateDetails intermediateDetails = new IntermediateDetails();
		intermediateDetails.setInterRollNumber(studentRegistrationFormDTO.getInterRollNumber());
		intermediateDetails.setInterBoardName(studentRegistrationFormDTO.getInterBoardName());
		intermediateDetails.setInterPassingYear(studentRegistrationFormDTO.getInterPassingYear());
		intermediateDetails.setInterPercentageObtained(studentRegistrationFormDTO.getInterPercentageObtained());
		intermediateDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
		
		OtherPersonalDetails otherPersonalDetails = new OtherPersonalDetails();
		otherPersonalDetails.setDisabled(studentRegistrationFormDTO.isDisabled());
		otherPersonalDetails.setTypeOfDisability(studentRegistrationFormDTO.getTypeOfDisability());
		otherPersonalDetails.setPercentageOfDisability(studentRegistrationFormDTO.getPercentageOfDisability());
		otherPersonalDetails.setMaritalStatus(studentRegistrationFormDTO.getMaritalStatus());
		otherPersonalDetails.setParentsProfession(studentRegistrationFormDTO.getParentsProfession());
		otherPersonalDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
				
		TenthDetails tenthDetails =new TenthDetails();
		tenthDetails.setSscRollNumber(studentRegistrationFormDTO.getSscRollNumber());
		tenthDetails.setSscBoardName(studentRegistrationFormDTO.getSscBoardName());
		tenthDetails.setSscPassingYear(studentRegistrationFormDTO.getSscPassingYear());
		tenthDetails.setSscPercentageObtained(studentRegistrationFormDTO.getSscPercentageObtained());
		tenthDetails.setScholarShipName(studentRegistrationFormDTO.getScholarShipName());
		
		registrationForm.setAcademicDetailsList(Arrays.asList(academicDetails));
		registrationForm.setBasicDetails(Arrays.asList(basicDetails));
		registrationForm.setContactDetails(Arrays.asList(contactDetails));
		registrationForm.setDocumentsUploads(Arrays.asList(documentsUploads));
		registrationForm.setFeeDetails(Arrays.asList(feeDetails));
		registrationForm.setIntermediateDetails(Arrays.asList(intermediateDetails));
		registrationForm.setOtherPersonalDetails(Arrays.asList(otherPersonalDetails));
		registrationForm.setTenthDetails(Arrays.asList(tenthDetails));

		/*
		 * 
		 * return registrationForm.builder()
		 * .academicDetailsList(Arrays.asList(academicDetails))
		 * .basicDetails(Arrays.asList(basicDetails))
		 * .contactDetails(Arrays.asList(contactDetails))
		 * .documentsUploads(Arrays.asList(documentsUploads))
		 * .feeDetails(Arrays.asList(feeDetails))
		 * .intermediateDetails(Arrays.asList(intermediateDetails))
		 * .otherPersonalDetails(Arrays.asList(otherPersonalDetails))
		 * .tenthDetails(Arrays.asList(tenthDetails)) .build();
		 */

		return registrationForm;

	}

	public static StudentRegistrationFormDTO buildAndGetStudentDTOByEntity(
			StudentRegistrationForm studentRegistrationForm) {
		AcademicDetails academicDetailsList = studentRegistrationForm.getAcademicDetailsList().isEmpty()!=true 
				? studentRegistrationForm.getAcademicDetailsList().get(0) : new AcademicDetails();
		
		BasicDetails basicDetails = studentRegistrationForm.getBasicDetails().isEmpty()!=true 
				? studentRegistrationForm.getBasicDetails().get(0) : new BasicDetails();
		
		ContactDetails contactDetails = studentRegistrationForm.getContactDetails().isEmpty()!=true
				? studentRegistrationForm.getContactDetails().get(0) : new ContactDetails();
		
		DocumentsUpload documentsUploads = studentRegistrationForm.getDocumentsUploads().isEmpty() !=true
				? studentRegistrationForm.getDocumentsUploads().get(0) : new DocumentsUpload();
		
		FeeDetails feeDetails = studentRegistrationForm.getFeeDetails().isEmpty() !=true
				? studentRegistrationForm.getFeeDetails().get(0) : new FeeDetails();
		
		IntermediateDetails intermediateDetails = studentRegistrationForm.getIntermediateDetails().isEmpty() !=true
				? studentRegistrationForm.getIntermediateDetails().get(0) : new IntermediateDetails();
		
		OtherPersonalDetails otherPersonalDetails = studentRegistrationForm.getOtherPersonalDetails().isEmpty() !=true
				? studentRegistrationForm.getOtherPersonalDetails().get(0) : new OtherPersonalDetails();
		
		TenthDetails tenthDetails = studentRegistrationForm.getTenthDetails().isEmpty() !=true
				? studentRegistrationForm.getTenthDetails().get(0) : new TenthDetails();
		

		StudentRegistrationFormDTO studentRegistrationFormDTO=new StudentRegistrationFormDTO();
		studentRegistrationFormDTO.setAadharNumber(studentRegistrationForm.getAadharNumber());
		studentRegistrationFormDTO.setStateOfDomicile(studentRegistrationForm.getStateOfDomicile());
		studentRegistrationFormDTO.setDistrictOfDomicile(studentRegistrationForm.getDistrictOfDomicile());
		studentRegistrationFormDTO.setName(studentRegistrationForm.getName());
		studentRegistrationFormDTO.setDob(studentRegistrationForm.getDob());
		studentRegistrationFormDTO.setGender(studentRegistrationForm.getGender());
		studentRegistrationFormDTO.setMobileNumber(studentRegistrationForm.getMobileNumber());
		studentRegistrationFormDTO.setEmailId(studentRegistrationForm.getEmailId());
		studentRegistrationFormDTO.setInstituteId(studentRegistrationForm.getInstituteId());
		studentRegistrationFormDTO.setBankName(studentRegistrationForm.getBankName());
		studentRegistrationFormDTO.setIfscCode(studentRegistrationForm.getIfscCode());
		studentRegistrationFormDTO.setAccountNumber(studentRegistrationForm.getAccountNumber());
		studentRegistrationFormDTO.setPassword(studentRegistrationForm.getPassword());
		studentRegistrationFormDTO.setConfirmPassword(studentRegistrationForm.getConfirmPassword());
		studentRegistrationFormDTO.setRegFormTermsAndConditions(studentRegistrationForm.isRegFormTermsAndConditions());
		studentRegistrationFormDTO.setInstituteName(academicDetailsList.getInstituteName());
		studentRegistrationFormDTO.setPresentClassOrCourse(academicDetailsList.getPresentClassOrCourse());
		studentRegistrationFormDTO.setPresentClassOrCourseYear(academicDetailsList.getPresentClassOrCourseYear());
		studentRegistrationFormDTO.setModeOfStudy(academicDetailsList.getModeOfStudy());
		studentRegistrationFormDTO.setClassStartDate(academicDetailsList.getClassStartDate());
		studentRegistrationFormDTO.setUniversityOrBoardName(academicDetailsList.getUniversityOrBoardName());
		studentRegistrationFormDTO.setPreviousClassCourse(academicDetailsList.getPreviousClassCourse());
		studentRegistrationFormDTO.setPreviousPassingYear(academicDetailsList.getPreviousPassingYear());
		studentRegistrationFormDTO.setPreviousPercentage(academicDetailsList.getPreviousPercentage());
		studentRegistrationFormDTO.setScholarShipName(academicDetailsList.getScholarShipName());
		studentRegistrationFormDTO.setReligion(basicDetails.getReligion());
		studentRegistrationFormDTO.setCommunityOrCategory(basicDetails.getCommunityOrCategory());
		studentRegistrationFormDTO.setFatherName(basicDetails.getFatherName());
		studentRegistrationFormDTO.setMotherName(basicDetails.getMotherName());
		studentRegistrationFormDTO.setFamilyIncome(basicDetails.getFamilyIncome());
		studentRegistrationFormDTO.setState(contactDetails.getState());
		studentRegistrationFormDTO.setDistrict(contactDetails.getDistrict());
		studentRegistrationFormDTO.setBlockOrTaluka(contactDetails.getBlockOrTaluka());
		studentRegistrationFormDTO.setHouseNumber(contactDetails.getHouseNumber());
		studentRegistrationFormDTO.setStreetNumber(contactDetails.getStreetNumber());
		studentRegistrationFormDTO.setPinCode(contactDetails.getPinCode());
		studentRegistrationFormDTO.setDomicileCert(documentsUploads.getDomicileCert());
		studentRegistrationFormDTO.setStudentPhoto(documentsUploads.getStudentPhoto());
		studentRegistrationFormDTO.setInstituteIdCard(documentsUploads.getInstituteIdCard());
		studentRegistrationFormDTO.setCasteOrIncomeCert(documentsUploads.getCasteOrIncomeCert());
		studentRegistrationFormDTO.setPreviousYearMarkSheet(documentsUploads.getPreviousYearMarkSheet());
		studentRegistrationFormDTO.setFeeReceiptOfCurrentYear(documentsUploads.getFeeReceiptOfCurrentYear());
		studentRegistrationFormDTO.setBankPassbook(documentsUploads.getBankPassbook());
		studentRegistrationFormDTO.setAadharCard(documentsUploads.getAadharCard());
		studentRegistrationFormDTO.setTenthMarkSheet(documentsUploads.getTenthMarkSheet());
		studentRegistrationFormDTO.setInterMarkSheet(documentsUploads.getInterMarkSheet());
		studentRegistrationFormDTO.setDocTermsAndConditions(documentsUploads.isDocTermsAndConditions());
		studentRegistrationFormDTO.setAdmissionFee(feeDetails.getAdmissionFee());
		studentRegistrationFormDTO.setTuitionFee(feeDetails.getTuitionFee());
		studentRegistrationFormDTO.setOtherFee(feeDetails.getOtherFee());
		studentRegistrationFormDTO.setInterRollNumber(intermediateDetails.getInterRollNumber());
		studentRegistrationFormDTO.setInterBoardName(intermediateDetails.getInterBoardName());
		studentRegistrationFormDTO.setInterPassingYear(intermediateDetails.getInterPassingYear());
		studentRegistrationFormDTO.setInterPercentageObtained(intermediateDetails.getInterPercentageObtained());
		studentRegistrationFormDTO.setTypeOfDisability(otherPersonalDetails.getTypeOfDisability());
		studentRegistrationFormDTO.setPercentageOfDisability(otherPersonalDetails.getPercentageOfDisability());
		studentRegistrationFormDTO.setMaritalStatus(otherPersonalDetails.getMaritalStatus());
		studentRegistrationFormDTO.setParentsProfession(otherPersonalDetails.getParentsProfession());
		studentRegistrationFormDTO.setDisabled(otherPersonalDetails.isDisabled());
		studentRegistrationFormDTO.setSscRollNumber(tenthDetails.getSscRollNumber());
		studentRegistrationFormDTO.setSscBoardName(tenthDetails.getSscBoardName());
		studentRegistrationFormDTO.setSscPassingYear(tenthDetails.getSscPassingYear());
		studentRegistrationFormDTO.setSscPercentageObtained(tenthDetails.getSscPercentageObtained());
				
		return studentRegistrationFormDTO;

	}

}
