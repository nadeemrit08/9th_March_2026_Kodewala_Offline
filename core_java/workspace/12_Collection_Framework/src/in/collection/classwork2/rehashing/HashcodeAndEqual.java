package in.collection.classwork2.rehashing;

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
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}

}

public class HashcodeAndEqual {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>();

		cities.add("BLR");
		cities.add("CHE");
		cities.add("BLR");

		System.out.println(cities.size()); // 2

		Set<Employee> emps = new HashSet<Employee>();
		Employee e1 = new Employee("ritesh");
		Employee e2 = new Employee("suraj");
		Employee e3 = new Employee("jyoti");
		Employee e4 = new Employee("ritesh");

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

		System.out.println(emps.size()); // 4
		System.out.println(e1.hashCode() + " " + e4.hashCode() + " and e1 and e4 are same ? : " + e1.equals(e4));

	}
}
