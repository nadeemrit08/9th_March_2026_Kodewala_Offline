package in.collection.classwork;

import java.util.Objects;

class Personn {
	String firstName;
	String lastName;

	public Personn(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personn other = (Personn) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

}

public class Driver2 {

	public static void main(String[] args) {

		Personn p1 = new Personn("ajay", "kumar");
		Personn p2 = new Personn("ajay", "kumar");

		System.out.println(p1.equals(p2)); // false

		System.out.println(p1.hashCode() + " " + p2.hashCode());
	}

}
