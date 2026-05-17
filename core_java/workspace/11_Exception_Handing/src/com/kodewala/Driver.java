package com.kodewala;

class Employee {

	String empName;
	String department;
	Manager manager;

	public Employee(String empName, String department, Manager manager) {
		this.empName = empName;
		this.department = department;
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
}

class Manager {

	private String managerName;

	public Manager(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}

class WorkStatus {

	String status;
	String message;

	public WorkStatus(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Manager manager = new Manager("Suresh Bishnoi");

		Employee emp = new Employee("Nadeem", "Development", manager); // Manager is not null

		WorkStatus work;

		try {

			// NullPointerException
			String managerName = emp.getManager().getManagerName();

			System.out.println(managerName.charAt(0));

			work = new WorkStatus("Active", "Manager Assigned");
			
			System.out.println("Status: " + work.getStatus());			
			System.out.println("Message: " + work.getMessage());

		} catch (NullPointerException e) {

			work = new WorkStatus("On Hold", "Manager not assigned");

			System.out.println("Status: " + work.getStatus());
		}
	}
}
