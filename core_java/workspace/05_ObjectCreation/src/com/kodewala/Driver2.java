package com.kodewala;

class Employee {

	int empId;
	String empName;
	int empSalary;

	public Employee(int empId, String empName, int empSalary) {
		super();
		System.out.println("Param Constructor.....payment() callled...!!");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		System.out.println("Default Constructor......Calling Payment()....!!!");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Employee emp1 = new Employee(101, "Nadeem", 25000);
		
		System.out.println(" emp1 ---> Employee ID " + emp1.empId);
		System.out.println(" emp1 ---> Employee Name " + emp1.empName);
		System.out.println(" emp1 ---> Employee Salary " + emp1.empSalary);
	}
}
