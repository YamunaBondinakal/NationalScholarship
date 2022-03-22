package com.lti.scholarship.nationalscholarship.dto.studentregform;

import lombok.Builder;

@Builder
public class StudentRegistrationFormDTO {
	public Long aadharNumber;
	public String stateOfDomicile;
	public String districtOfDomicile;
	public String name;
	public String dob;
	public String gender;
	public String mobileNumber;
	public String emailId;
	public String instituteId;
	public String bankName;
	public String ifscCode;
	public long accountNumber;
	public String password;
	public String confirmPassword;
	public boolean regFormTermsAndConditions;
	public String instituteName;
	public String presentClassOrCourse;
	public int presentClassOrCourseYear;
	public String modeOfStudy;
	public String classStartDate;
	public String universityOrBoardName;
	public String previousClassCourse;
	public int previousPassingYear;
	public double previousPercentage;
	public int scholarShipId;
	public String religion;
	public String communityOrCategory;
	public String fatherName;
	public String motherName;
	public double familyIncome;
	public String state;
	public String district;
	public String blockOrTaluka;
	public String houseNumber;
	public String streetNumber;
	public int pinCode;
	public boolean domicileCert;
	public boolean studentPhoto;
	public boolean instituteIdCard;
	public boolean casteOrIncomeCert;
	public boolean previousYearMarkSheet;
	public boolean feeReceiptOfCurrentYear;
	public boolean bankPassbook;
	public boolean aadharCard;
	public boolean tenthMarkSheet;
	public boolean interMarkSheet;
	public boolean docTermsAndConditions;
	public double admissionFee;
	public double tuitionFee;
	public double otherFee;
	public String interRollNumber;
	public String interBoardName;
	public int interPassingYear;
	public double interPercentageObtained;
	public String typeOfDisability;
	public double percentageOfDisability;
	public String maritalStatus;
	public String parentsProfession;
	public boolean disabled;
	public String sscRollNumber;
	public String sscBoardName;
	public int sscPassingYear;
	public double sscPercentageObtained;
	
	public StudentRegistrationFormDTO(Long aadharNumber, String stateOfDomicile, String districtOfDomicile, String name,
			String dob, String gender, String mobileNumber, String emailId, String instituteId, String bankName,
			String ifscCode, long accountNumber, String password, String confirmPassword,
			boolean regFormTermsAndConditions, String instituteName, String presentClassOrCourse,
			int presentClassOrCourseYear, String modeOfStudy, String classStartDate, String universityOrBoardName,
			String previousClassCourse, int previousPassingYear, double previousPercentage, int scholarShipId,
			String religion, String communityOrCategory, String fatherName, String motherName, double familyIncome,
			String state, String district, String blockOrTaluka, String houseNumber, String streetNumber, int pinCode,
			boolean domicileCert, boolean studentPhoto, boolean instituteIdCard, boolean casteOrIncomeCert,
			boolean previousYearMarkSheet, boolean feeReceiptOfCurrentYear, boolean bankPassbook, boolean aadharCard,
			boolean tenthMarkSheet, boolean interMarkSheet, boolean docTermsAndConditions, double admissionFee,
			double tuitionFee, double otherFee, String interRollNumber, String interBoardName, int interPassingYear,
			double interPercentageObtained, String typeOfDisability, double percentageOfDisability,
			String maritalStatus, String parentsProfession, boolean disabled, String sscRollNumber, String sscBoardName,
			int sscPassingYear, double sscPercentageObtained) {
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
		this.instituteName = instituteName;
		this.presentClassOrCourse = presentClassOrCourse;
		this.presentClassOrCourseYear = presentClassOrCourseYear;
		this.modeOfStudy = modeOfStudy;
		this.classStartDate = classStartDate;
		this.universityOrBoardName = universityOrBoardName;
		this.previousClassCourse = previousClassCourse;
		this.previousPassingYear = previousPassingYear;
		this.previousPercentage = previousPercentage;
		this.scholarShipId = scholarShipId;
		this.religion = religion;
		this.communityOrCategory = communityOrCategory;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.familyIncome = familyIncome;
		this.state = state;
		this.district = district;
		this.blockOrTaluka = blockOrTaluka;
		this.houseNumber = houseNumber;
		this.streetNumber = streetNumber;
		this.pinCode = pinCode;
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
		this.admissionFee = admissionFee;
		this.tuitionFee = tuitionFee;
		this.otherFee = otherFee;
		this.interRollNumber = interRollNumber;
		this.interBoardName = interBoardName;
		this.interPassingYear = interPassingYear;
		this.interPercentageObtained = interPercentageObtained;
		this.typeOfDisability = typeOfDisability;
		this.percentageOfDisability = percentageOfDisability;
		this.maritalStatus = maritalStatus;
		this.parentsProfession = parentsProfession;
		this.disabled = disabled;
		this.sscRollNumber = sscRollNumber;
		this.sscBoardName = sscBoardName;
		this.sscPassingYear = sscPassingYear;
		this.sscPercentageObtained = sscPercentageObtained;
	}
	
	public StudentRegistrationFormDTO()	{
		
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

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getPresentClassOrCourse() {
		return presentClassOrCourse;
	}

	public void setPresentClassOrCourse(String presentClassOrCourse) {
		this.presentClassOrCourse = presentClassOrCourse;
	}

	public int getPresentClassOrCourseYear() {
		return presentClassOrCourseYear;
	}

	public void setPresentClassOrCourseYear(int presentClassOrCourseYear) {
		this.presentClassOrCourseYear = presentClassOrCourseYear;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public String getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}

	public String getUniversityOrBoardName() {
		return universityOrBoardName;
	}

	public void setUniversityOrBoardName(String universityOrBoardName) {
		this.universityOrBoardName = universityOrBoardName;
	}

	public String getPreviousClassCourse() {
		return previousClassCourse;
	}

	public void setPreviousClassCourse(String previousClassCourse) {
		this.previousClassCourse = previousClassCourse;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	public double getPreviousPercentage() {
		return previousPercentage;
	}

	public void setPreviousPercentage(double previousPercentage) {
		this.previousPercentage = previousPercentage;
	}

	public int getScholarShipId() {
		return scholarShipId;
	}

	public void setScholarShipId(int scholarShipId) {
		this.scholarShipId = scholarShipId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunityOrCategory() {
		return communityOrCategory;
	}

	public void setCommunityOrCategory(String communityOrCategory) {
		this.communityOrCategory = communityOrCategory;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockOrTaluka() {
		return blockOrTaluka;
	}

	public void setBlockOrTaluka(String blockOrTaluka) {
		this.blockOrTaluka = blockOrTaluka;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
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

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public String getInterRollNumber() {
		return interRollNumber;
	}

	public void setInterRollNumber(String interRollNumber) {
		this.interRollNumber = interRollNumber;
	}

	public String getInterBoardName() {
		return interBoardName;
	}

	public void setInterBoardName(String interBoardName) {
		this.interBoardName = interBoardName;
	}

	public int getInterPassingYear() {
		return interPassingYear;
	}

	public void setInterPassingYear(int interPassingYear) {
		this.interPassingYear = interPassingYear;
	}

	public double getInterPercentageObtained() {
		return interPercentageObtained;
	}

	public void setInterPercentageObtained(double interPercentageObtained) {
		this.interPercentageObtained = interPercentageObtained;
	}

	public String getTypeOfDisability() {
		return typeOfDisability;
	}

	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public double getPercentageOfDisability() {
		return percentageOfDisability;
	}

	public void setPercentageOfDisability(double percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getParentsProfession() {
		return parentsProfession;
	}

	public void setParentsProfession(String parentsProfession) {
		this.parentsProfession = parentsProfession;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getSscRollNumber() {
		return sscRollNumber;
	}

	public void setSscRollNumber(String sscRollNumber) {
		this.sscRollNumber = sscRollNumber;
	}

	public String getSscBoardName() {
		return sscBoardName;
	}

	public void setSscBoardName(String sscBoardName) {
		this.sscBoardName = sscBoardName;
	}

	public int getSscPassingYear() {
		return sscPassingYear;
	}

	public void setSscPassingYear(int sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}

	public double getSscPercentageObtained() {
		return sscPercentageObtained;
	}

	public void setSscPercentageObtained(double sscPercentageObtained) {
		this.sscPercentageObtained = sscPercentageObtained;
	}
	
	
}
