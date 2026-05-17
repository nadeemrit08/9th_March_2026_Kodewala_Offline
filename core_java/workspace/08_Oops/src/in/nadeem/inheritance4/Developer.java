package in.nadeem.inheritance4;

public class Developer extends Employee {

	double bonus = 5000;

	@Override
	public double calculateSalary() {

		return salary + bonus;
	}
}
