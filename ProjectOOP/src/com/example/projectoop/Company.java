package com.example.projectoop;

import java.util.ArrayList;
public class Company {
	private String nameOfCompany;
	private ArrayList<Employee> employees=new ArrayList<>();

	public String getNameOfCompany() {
	return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
	this.nameOfCompany = nameOfCompany;
	}
	public double getSumOfSalary(int month) {
	double sum = 0.00;
	for(Employee e : employees) {
	sum += e.getWorkingHours(month) * e.getSalary(month);
	}
	return sum;
	}
	public Employee getMostBusyEmployee(int month) {
	if(employees.size()<=0) {
	throw new IllegalArgumentException("Brak pracownikow");
	}
	else{
	Employee mostBusyEmployee = employees.get(0);

	        for (Employee e : employees) {
	            int hours = e.getWorkingHours(month);
	            int maxHours = mostBusyEmployee.getWorkingHours(month);

	            if (hours > maxHours) {
	                mostBusyEmployee = e;
	            }
	        }

	        return mostBusyEmployee;
	    }
	}
	public void addEmployee(Employee e){
	    if(e != null) {
	    employees.add(e);
	    }
	    else {
	    throw new IllegalArgumentException("Uncrect input.");
	    }
	}
	public String toString() {
	return "Company's name is " + getNameOfCompany() +employees.toString();
	}
}
