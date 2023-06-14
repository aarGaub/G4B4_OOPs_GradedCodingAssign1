package com.abc.departments.service;

public class TechDepartment extends SuperDepartment {
	
	String techStackInformation;
	
	public TechDepartment(String departmentName, String todaysWork, String workDeadline, String techStackInformation) 
	{
		super(departmentName, todaysWork, workDeadline);
		
		this.techStackInformation = techStackInformation;
		
	}
	
	public String getTechStackInformation()
	{
		return techStackInformation;
	}
	
	@Override
	public void displayAllFunctionality() {
		
		System.out.println("Welcome to "+departmentName()+" Department ");
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println();
			
		}
}
