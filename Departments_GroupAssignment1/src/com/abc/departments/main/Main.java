package com.abc.departments.main;

import com.abc.departments.interfaces.IDepartments;
import com.abc.departments.service.AdminDepartment;
import com.abc.departments.service.HRDepartment;
import com.abc.departments.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
	/* Each concrete class/department object can be referenced by variable of type IDepartments */
		
		IDepartments dept = new AdminDepartment("Admin","Complete your documents Submission",
				"Complete by EOD");
		dept.displayAllFunctionality();
		
		
		dept = new HRDepartment("HR","Fill today's timesheet and mark your attendance",
				"Complete by EOD","team Lunch");
		dept.displayAllFunctionality();
		
	
		dept = new TechDepartment("Tech","Complete coding of module 1",
				"Complete by EOD","Core Java");
		dept.displayAllFunctionality();
		
	}

}
