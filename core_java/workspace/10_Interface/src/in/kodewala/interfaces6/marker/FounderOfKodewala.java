package in.kodewala.interfaces6.marker;

public class FounderOfKodewala implements Cloneable {

	String name;
	String email;

	public FounderOfKodewala(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public FounderOfKodewala clone() throws CloneNotSupportedException {

		return (FounderOfKodewala) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		FounderOfKodewala fok = new FounderOfKodewala("Suresh Bishnoi", "suresh123@gmail.com");

		System.out.println("Name: " + fok.name + " , " + "Email: " + fok.email);

		FounderOfKodewala fok1 = fok.clone();
		
		System.out.println("Name: " + fok1.name + " , " + "Email: " + fok1.email);
		
		if (fok instanceof Cloneable) {
			System.out.println("fok is a type of cloneable...!!!");
		}
		else {
			System.out.println("fok is not cloneable. You can't clone the object of Founder of Kodewala");
		}

	}

}
