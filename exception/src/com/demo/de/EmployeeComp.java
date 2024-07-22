package com.demo.de;

import java.util.Comparator;

public class EmployeeComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return 0;
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		if(o1.getId()<o2.getId())
		{
			return -1;
		}
		else {
			return 0;
	}

	
	
	}

}
