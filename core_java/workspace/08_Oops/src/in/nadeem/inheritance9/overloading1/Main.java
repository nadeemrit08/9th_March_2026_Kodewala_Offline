package in.nadeem.inheritance9.overloading1;

class Employee {

	public void calculateSalary(double baseSalary) {
		System.out.println("BaseSalary : " + baseSalary);
	}

	public void calculateSalary(double baseSalary, double bonus) {
		double totalSalary = baseSalary + bonus;
		System.out.println("BaseSalary + Bonus: " + totalSalary);
	}

	public void calculateSalary(double baseSalary, double bonus, double incentives) {
		double totalSalary = baseSalary + bonus + incentives;
		System.out.println("BaseSalary + Bonus + Incentives): " + totalSalary);
	}
}

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.calculateSalary(25000);

		emp.calculateSalary(3000, 5000);

		emp.calculateSalary(40000, 10000, 7000);
	}
}
