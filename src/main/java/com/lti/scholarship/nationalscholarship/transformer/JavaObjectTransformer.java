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
		academicDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		academicDetails.setStudentRegistrationForm(registrationForm);
				

		BasicDetails basicDetails = new BasicDetails();
		basicDetails.setReligion(studentRegistrationFormDTO.getReligion());
		basicDetails.setCommunityOrCategory(studentRegistrationFormDTO.getCommunityOrCategory());
		basicDetails.setFatherName(studentRegistrationFormDTO.getFatherName());
		basicDetails.setMotherName(studentRegistrationFormDTO.getMotherName());
		basicDetails.setFamilyIncome(studentRegistrationFormDTO.getFamilyIncome());
		basicDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		basicDetails.setStudentRegistrationForm(registrationForm);
	
	   ContactDetails contactDetails =new ContactDetails();
	   contactDetails.setState(studentRegistrationFormDTO.getState());
	   contactDetails.setDistrict(studentRegistrationFormDTO.getDistrict());
	   contactDetails.setBlockOrTaluka(studentRegistrationFormDTO.getBlockOrTaluka());
	   contactDetails.setHouseNumber(studentRegistrationFormDTO.getHouseNumber());
	   contactDetails.setStreetNumber(studentRegistrationFormDTO.getStreetNumber());
	   contactDetails.setPinCode(studentRegistrationFormDTO.getPinCode());
	   contactDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
	   contactDetails.setStudentRegistrationForm(registrationForm);
	   
	   DocumentsUpload documentsUploads =new DocumentsUpload();
	   documentsUploads.setDomicileCert(studentRegistrationFormDTO.isDomicileCert());
	   documentsUploads.setStudentPhoto(studentRegistrationFormDTO.isStudentPhoto());
	   documentsUploads.setInstituteIdCard(studentRegistrationFormDTO.isInstituteIdCard());
	   documentsUploads.setCasteOrIncomeCert(studentRegistrationFormDTO.isCasteOrIncomeCert());
	   documentsUploads.setPreviousYearMarkSheet(studentRegistrationFormDTO.isPreviousYearMarkSheet());
	   documentsUploads.setFeeReceiptOfCurrentYear(studentRegistrationFormDTO.isFeeReceiptOfCurrentYear());
	   documentsUploads.setBankPassbook(studentRegistrationFormDTO.isBankPassbook());
	   documentsUploads.setAadharCard(studentRegistrationFormDTO.isAadharCard());
	   documentsUploads.setTenthMarkSheet(studentRegistrationFormDTO.isTenthMarkSheet());
	   documentsUploads.setInterMarkSheet(studentRegistrationFormDTO.isInterMarkSheet());
	   documentsUploads.setDocTermsAndConditions(studentRegistrationFormDTO.isDocTermsAndConditions());
	   documentsUploads.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
	   documentsUploads.setStudentRegistrationForm(registrationForm);
	   
		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setAdmissionFee(studentRegistrationFormDTO.getAdmissionFee());
		feeDetails.setTuitionFee(studentRegistrationFormDTO.getTuitionFee());
		feeDetails.setOtherFee(studentRegistrationFormDTO.getOtherFee());
		feeDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		feeDetails.setStudentRegistrationForm(registrationForm);
		
		IntermediateDetails intermediateDetails = new IntermediateDetails();
		intermediateDetails.setInterRollNumber(studentRegistrationFormDTO.getInterRollNumber());
		intermediateDetails.setInterBoardName(studentRegistrationFormDTO.getInterBoardName());
		intermediateDetails.setInterPassingYear(studentRegistrationFormDTO.getInterPassingYear());
		intermediateDetails.setInterPercentageObtained(studentRegistrationFormDTO.getInterPercentageObtained());
		intermediateDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		intermediateDetails.setStudentRegistrationForm(registrationForm);
		
		OtherPersonalDetails otherPersonalDetails = new OtherPersonalDetails();
		otherPersonalDetails.setDisabled(studentRegistrationFormDTO.isDisabled());
		otherPersonalDetails.setTypeOfDisability(studentRegistrationFormDTO.getTypeOfDisability());
		otherPersonalDetails.setPercentageOfDisability(studentRegistrationFormDTO.getPercentageOfDisability());
		otherPersonalDetails.setMaritalStatus(studentRegistrationFormDTO.getMaritalStatus());
		otherPersonalDetails.setParentsProfession(studentRegistrationFormDTO.getParentsProfession());
		otherPersonalDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		otherPersonalDetails.setStudentRegistrationForm(registrationForm);		
				
		TenthDetails tenthDetails =new TenthDetails();
		tenthDetails.setSscRollNumber(studentRegistrationFormDTO.getSscRollNumber());
		tenthDetails.setSscBoardName(studentRegistrationFormDTO.getSscBoardName());
		tenthDetails.setSscPassingYear(studentRegistrationFormDTO.getSscPassingYear());
		tenthDetails.setSscPercentageObtained(studentRegistrationFormDTO.getSscPercentageObtained());
		tenthDetails.setScholarShipId(studentRegistrationFormDTO.getScholarShipId());
		tenthDetails.setStudentRegistrationForm(registrationForm);
		
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
		AcademicDetails academicDetailsList = studentRegistrationForm.getAcademicDetailsList().get(0);
		BasicDetails basicDetails = studentRegistrationForm.getBasicDetails().get(0);
		ContactDetails contactDetails = studentRegistrationForm.getContactDetails().get(0);
		DocumentsUpload documentsUploads = studentRegistrationForm.getDocumentsUploads().get(0);
		FeeDetails feeDetails = studentRegistrationForm.getFeeDetails().get(0);
		IntermediateDetails intermediateDetails = studentRegistrationForm.getIntermediateDetails().get(0);
		OtherPersonalDetails otherPersonalDetails = studentRegistrationForm.getOtherPersonalDetails().get(0);
		TenthDetails tenthDetails = studentRegistrationForm.getTenthDetails().get(0);

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
		studentRegistrationFormDTO.setScholarShipId(academicDetailsList.getScholarShipId());
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
		studentRegistrationFormDTO.setDomicileCert(documentsUploads.isDomicileCert());
		studentRegistrationFormDTO.setStudentPhoto(documentsUploads.isStudentPhoto());
		studentRegistrationFormDTO.setInstituteIdCard(documentsUploads.isInstituteIdCard());
		studentRegistrationFormDTO.setCasteOrIncomeCert(documentsUploads.isCasteOrIncomeCert());
		studentRegistrationFormDTO.setPreviousYearMarkSheet(documentsUploads.isPreviousYearMarkSheet());
		studentRegistrationFormDTO.setFeeReceiptOfCurrentYear(documentsUploads.isFeeReceiptOfCurrentYear());
		studentRegistrationFormDTO.setBankPassbook(documentsUploads.isBankPassbook());
		studentRegistrationFormDTO.setAadharCard(documentsUploads.isAadharCard());
		studentRegistrationFormDTO.setTenthMarkSheet(documentsUploads.isTenthMarkSheet());
		studentRegistrationFormDTO.setInterMarkSheet(documentsUploads.isInterMarkSheet());
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
