package in.collection.classwork1;

import java.util.HashSet;
import java.util.Set;

class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}

public class Driver {

	public static void main(String[] args) {

		Set<String> students = new HashSet<String>();
		students.add("John");
		students.add("Raju");
		students.add("Rani");
		students.add("John");

		System.out.println(students);
		System.out.println(students.size());

		Employee e1 = new Employee("Nadeem");
		Employee e2 = new Employee("Nadeem");

		System.out.println(e1.hashCode() + " and " + e2.hashCode() + " is e1 and e2 are equals? :: " + e1.equals(e2));
	}
}
