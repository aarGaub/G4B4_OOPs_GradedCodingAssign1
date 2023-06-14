package com.abc.departments.service;

public class AdminDepartment extends SuperDepartment {

	
	public AdminDepartment(String departmentName, String todaysWork, String workDeadline) {
		
		super(departmentName, todaysWork, workDeadline);
		
	}
	
	@Override
	public void displayAllFunctionality() {
		
		System.out.println("Welcome to "+departmentName()+" Department ");
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
		
	}
}
