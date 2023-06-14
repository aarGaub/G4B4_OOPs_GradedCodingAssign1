package com.abc.departments.service;

public class HRDepartment extends SuperDepartment {
	
	String activity;
	
	public HRDepartment(String departmentName, String todaysWork, String workDeadline, String activity)
	{
		super(departmentName, todaysWork, workDeadline);
		
		this.activity = activity;
	}

	public String doActivity()
	{
		
		return activity;
	}
	
	@Override
	public void displayAllFunctionality() {
		
		System.out.println("Welcome to "+departmentName()+" Department ");
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
		
	}
	
}
