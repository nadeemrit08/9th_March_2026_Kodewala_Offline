package in.collection.set;

class Personn {
	String firstName;
	String lastName;

	public Personn(String firstName, String lastName) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/*
	 * @Override public boolean equals(Object obj2) {
	 * 
	 * Personn p2 = (Personn) obj2; return this.firstName.equals(p2.firstName) &
	 * this.lastName.equals(p2.lastName); }
	 */

	@Override
	public int hashCode() {

		return this.firstName.hashCode() + this.lastName.hashCode();
	}

}

public class Driver4 {

	public static void main(String[] args) {

		Personn p1 = new Personn("Nadeem", "Ahmad");
		Personn p2 = new Personn("Nadeem", "Ahmad");

		System.out.println(p1.equals(p2));

		System.out.println(p1.hashCode() + " " + p2.hashCode());
	}
}
