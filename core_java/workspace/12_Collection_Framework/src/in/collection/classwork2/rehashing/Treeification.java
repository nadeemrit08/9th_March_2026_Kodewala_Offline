package in.collection.classwork2.rehashing;

import java.util.HashSet;
import java.util.Set;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		Person p = (Person) obj;

		return this.name.equals(p.name);
	}

	@Override
	public int hashCode() {

		// Force every object into same bucket
		return 12345;
	}

	@Override
	public String toString() {

		return name;
	}
}

public class Treeification {

	public static void main(String[] args) {

		Set<Person> persons = new HashSet<>(64);

		// Add 9 elements
		persons.add(new Person("n1"));
		persons.add(new Person("n2"));
		persons.add(new Person("n3"));
		persons.add(new Person("n4"));
		persons.add(new Person("n5"));
		persons.add(new Person("n6"));
		persons.add(new Person("n7"));
		persons.add(new Person("n8"));

		System.out.println("After Adding 8 Elements");
		System.out.println(persons);
		System.out.println("Size : " + persons.size());

		
		persons.add(new Person("n9"));

		System.out.println();
		System.out.println("After Adding 9th Element");
		System.out.println(persons);
		System.out.println("Size : " + persons.size());

		
		persons.remove(new Person("n9"));
		persons.remove(new Person("n8"));
		

		System.out.println();
		System.out.println("After Removing Elements");
		System.out.println(persons);
		System.out.println("Size : " + persons.size());

		
	}
}