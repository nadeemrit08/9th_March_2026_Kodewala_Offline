package in.collection.classwork5.TreeSet;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Employee emp) {

		return this.name.compareTo(emp.name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}

class Person implements Comparable<Person> {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

public class Driver {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<>();
		names.add("Ramu");
		names.add("Azam");
		names.add("Maish");
		names.add("Suresh");
		names.add("John");

		System.out.println(names);
		System.out.println(names.size());

		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee("Nadeem"));
		emp.add(new Employee("Shakib"));
		emp.add(new Employee("Gulzar"));
		emp.add(new Employee("Faeem"));

		TreeSet<Person> p = new TreeSet<Person>();
		p.add(new Person("Anas"));
		p.add(new Person("hasan"));
		p.add(new Person("Naeem"));
		p.add(new Person("Sabu"));
		p.add(new Person("Junaid"));

		System.out.println(emp);
		System.out.println(p);
	}
}
