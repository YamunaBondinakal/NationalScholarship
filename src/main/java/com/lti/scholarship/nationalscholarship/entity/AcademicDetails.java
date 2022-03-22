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
@Entity(name = "tbl_student_academic_details")
public class AcademicDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "academic_gen")
	@SequenceGenerator(name = "academic_gen", sequenceName = "academic_seq", allocationSize = 1)
	private int id;

	@JsonBackReference
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNumber")
	private StudentRegistrationForm studentRegistrationForm;
	private String instituteName;
	private String presentClassOrCourse;
	private int presentClassOrCourseYear;
	private String modeOfStudy;
	private String classStartDate;
	private String universityOrBoardName;
	private String previousClassCourse;
	private int previousPassingYear;
	private double previousPercentage;
	private int scholarShipId;

	public AcademicDetails(int id, StudentRegistrationForm studentRegistrationForm, String instituteName,
			String presentClassOrCourse, int presentClassOrCourseYear, String modeOfStudy, String classStartDate,
			String universityOrBoardName, String previousClassCourse, int previousPassingYear,
			double previousPercentage, int scholarShipId) {
		super();
		this.id = id;
		this.studentRegistrationForm = studentRegistrationForm;
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
	}

	public AcademicDetails() {

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

}
