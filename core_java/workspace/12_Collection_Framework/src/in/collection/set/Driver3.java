package in.collection.set;

class Person {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 431242343;
	}
}

public class Driver3 {

	public static void main(String[] args) {

		String s1 = "Nadeem";
		String s2 = "Nadeem";

		System.out.println(s1.hashCode() + " and " + s2.hashCode());

		Person p1 = new Person("Ajay");
		Person p2 = new Person("Vijay");

		System.out.println(p1.hashCode() + " and " + p2.hashCode() + " is p1 and p2 equals? " + p1.equals(p2));

	}
}
