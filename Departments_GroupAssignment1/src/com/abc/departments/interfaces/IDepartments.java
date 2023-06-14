package com.abc.departments.interfaces;

/* Interface for functionality that all departments must implement */

public interface IDepartments {
	
	public String departmentName();
		
	public String getTodaysWork();
	
	public String getWorkDeadline();
	
	public String isTodayAHoliday();
	
	public void displayAllFunctionality();

}
