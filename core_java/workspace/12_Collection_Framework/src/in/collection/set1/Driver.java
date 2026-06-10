package in.collection.set1;
/*
 * Question 1
 * What happens if we don't override equals() and hashCode() in a custom class?
 * 
 * Without overriding equals(), Java performs reference comparison instead of logical comparison.
 */
class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class Driver {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Nadeem");
		Person p2 = new Person(101, "Nadeem");
		
		System.out.println(p1.equals(p2));
		
		
	}
}
