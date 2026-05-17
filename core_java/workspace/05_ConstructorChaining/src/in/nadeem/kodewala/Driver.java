package in.nadeem.kodewala;

class Employee {
	String name;
	String empId;

	static int counter = 0;
	{
		counter++;
		empId = "Kodewala-" + counter;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("-------------------------");
	}

}

public class Driver {

	public static void main(String[] args) {

		Employee nadeem = new Employee("Nadeem");
		Employee ahmad = new Employee("Ahmad");
		Employee raja = new Employee("Raja");
		Employee rani = new Employee("Rani");

		nadeem.display();
		ahmad.display();
		raja.display();
		rani.display();
	}
}
