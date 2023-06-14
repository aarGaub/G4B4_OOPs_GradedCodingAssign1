package com.abc.departments.service;

import com.abc.departments.interfaces.IDepartments;

/* Making it abstract as Abstract class can be used to hold common functionality 
 * for all classes that extend it. */

public abstract class SuperDepartment implements IDepartments {
	

	String departmentName = "Super";
	String todaysWork = "No Work as of now" ;
	String workDeadline = "Nil" ;
	String todayAHoliday = "Today is not a holiday";
	
	public SuperDepartment(String departmentName, String todaysWork, String workDeadline) {
		
		this.departmentName = departmentName;
		this.todaysWork = todaysWork;
		this.workDeadline = workDeadline;
		
	}
	
	@Override
	public String departmentName(){
		
		return departmentName;
	}
	
	@Override
	public String getTodaysWork() {
		
		return todaysWork;
	}
	
	@Override
	public String getWorkDeadline() {
		
		return workDeadline;
	}
	
	@Override
	public String isTodayAHoliday() {
		
		return todayAHoliday;
	}

	/* Keeping this method abstract here, leaving implementation of display functionality 
	 * up to each concrete class/department */
	public abstract void displayAllFunctionality();
	
}
