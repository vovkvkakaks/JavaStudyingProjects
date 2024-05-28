package com.example.projectoop;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = Employee.randomEmployee();
		System.out.println(e.getSalary(4));
		System.out.println("-------------------");
		Manager m = new Manager(e);
		m.AddSubordinate(Employee.randomEmployee());
		System.out.println(m.getSalary(4));
		System.out.println("-------------------");
		System.out.println(e.getSumOfSalaries());
		System.out.println("-------------------");
		System.out.println(m.getSumOfSalaries());
		 
		Company c = new Company();
		c.setNameOfCompany("cos");
		c.addEmployee(Employee.randomEmployee());
		c.addEmployee(Employee.randomEmployee());
		c.addEmployee(Employee.randomEmployee());
		System.out.println(c.toString());
		Manager some = new Manager(Employee.randomEmployee());
		for(int i = 0;i<5;i++) {some.AddSubordinate(Employee.randomEmployee());
		}
		System.out.println(some.toString());
		}

	}


