package in.nadeem.inheritance9.overloading;

class Employees {
	public void find(int empId) {
		System.out.println("Employees.find(int empId)");
	}

	public void find(int empId, String empName) {
		System.out.println("Employees.find(int empId, String empName)");
	}

	public void find(int empId, String empName, double salary) {
		System.out.println("Employees.find(int empId, String empName, double salary)");
	}
}

public class Driver {

	public static void main(String[] args) {

		Employees emp = new Employees();
		emp.find(101);
	}
}
