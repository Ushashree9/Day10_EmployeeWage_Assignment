package com.bl.employeewage;

public interface EmployeeWage {
	
public void addCompany(Company company);
	
	public int getTotalWage(String companyName);
	
	public Company getCompany(int index);
	
	public Company getCompany(String companyName);
}