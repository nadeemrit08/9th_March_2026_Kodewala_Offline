package in.collection.classwork5.TreeSet.Comparator;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Employees e1 = new Employees("Nadeem", "Ahmad");
		Employees e3 = new Employees("Naeem", "Noman");
		Employees e2 = new Employees("Rohit", "Sharma");
		Employees e4 = new Employees("Virat", "Kohli");
		
		TreeSet<Employees> emps = new TreeSet<Employees>(new EmployeesImpl());
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		
		System.out.println(emps);
		
		for(Employees emp : emps) {
			System.out.println(emp.firstName + " " + emp.lastName);
		}
	}
}
