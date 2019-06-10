package com.cts.policymanagementsystem.model;

public class User {

	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String contactNumber;
	private String address;
	private String emailId;
	private String qualification;
	private String panNumber;
	private String employeeType;
	private String employer;
	private String hintQuestion;
	private String hintAnswer;
	private String password;
	private int salaryPerMonth;
	
	
	
	
	public User() {
		super();
	}
	public User(String firstName, String lastName, String gender, String dateOfBirth, String contactNumber,
			String address, String emailId, String qualification, String panNumber, String employeeType,
			String employer, String hintQuestion, String hintAnswer, String password, int salaryPerMonth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		this.address = address;
		this.emailId = emailId;
		this.qualification = qualification;
		this.panNumber = panNumber;
		this.employeeType = employeeType;
		this.employer = employer;
		this.hintQuestion = hintQuestion;
		this.hintAnswer = hintAnswer;
		this.password = password;
		this.salaryPerMonth = salaryPerMonth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getHintQuestion() {
		return hintQuestion;
	}
	public void setHintQuestion(String hintQuestion) {
		this.hintQuestion = hintQuestion;
	}
	public String getHintAnswer() {
		return hintAnswer;
	}
	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalaryPerMonth() {
		return salaryPerMonth;
	}
	public void setSalaryPerMonth(int salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
	
	
}