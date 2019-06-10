package com.cts.policymanagementsystem.model;
public class PolicyEntry {
	private String policyId,policyName,policyType,durationOfYears,company,intialDeposit,userType,termAmount,interest;


	public PolicyEntry() {
		super();
	}

	public PolicyEntry(String policyId, String policyName, String policyType, String durationOfYears, String company,
			String intialDeposit, String userType, String termAmount, String interest) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.durationOfYears = durationOfYears;
		this.company = company;
		this.intialDeposit = intialDeposit;
		this.userType = userType;
		this.termAmount = termAmount;
		this.interest = interest;
	}
	
	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getDurationOfYears() {
		return durationOfYears;
	}

	public void setDurationOfYears(String durationOfYears) {
		this.durationOfYears = durationOfYears;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIntialDeposit() {
		return intialDeposit;
	}

	public void setIntialDeposit(String intialDeposit) {
		this.intialDeposit = intialDeposit;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getTermAmount() {
		return termAmount;
	}

	public void setTermAmount(String termAmount) {
		this.termAmount = termAmount;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
}
