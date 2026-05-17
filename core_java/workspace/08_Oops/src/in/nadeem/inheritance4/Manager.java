package in.nadeem.inheritance4;

public class Manager extends Employee{

	double incentive = 5000;
	
	@Override
	public double calculateSalary() {
		
		return salary + incentive;
	}
}
