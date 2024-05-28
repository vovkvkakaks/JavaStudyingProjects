package com.example.projectoop;

import java.util.ArrayList;
public class Manager extends Employee{
	private ArrayList<Employee> subordinates = new ArrayList<>();
	public static double rate = 5;

	public static double getRate() {
	return rate;
	}

	public static void setRate(double rate) {
	Manager.rate = rate;
	}
	public Manager(Employee e) {
	super(e.getName(), e.getSurname(), e.getMoneyPerHour());
	this.setHoursInMonth(e.getHoursInMonth());
	}
	public Manager(String name, String surname, double moneyPerHour) {
	super(name, surname, moneyPerHour);
	}
	public void AddSubordinate(Employee e) {
	subordinates.add(e);
	}
	public int getNumberOfSubordinates() {
	return subordinates.size();
	}
	public double getBonus() {
	return getRate() * getNumberOfSubordinates();
	}
	public double getSalary(int month) {
	return super.getSalary(month) + getBonus();
	}
	public String toString() {
	return "Manager: " + super.toString() + ". NumOfSubordinates " + getNumberOfSubordinates();
	}
}
