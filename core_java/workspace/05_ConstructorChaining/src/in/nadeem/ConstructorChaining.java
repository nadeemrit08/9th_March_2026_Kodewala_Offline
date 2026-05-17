package in.nadeem;

class TicketBooking {

	public TicketBooking(String name) {
		System.out.println("TicketBooking Constructor Called");
	}
}

class IRCTC extends TicketBooking {

	String name;
	int adharNo;
	String location;

	public IRCTC(String name, int adharNo) {
		this(name, adharNo, "Bangalore"); // constructor chaining
	}

	public IRCTC(String name, int adharNo, String location) {
		super("some name"); // super class constructor
		this.name = name;
		this.adharNo = adharNo;
		this.location = location;
	}

	@Override
	public String toString() {
		return "IRCTC [name=" + name + ", adharNo=" + adharNo + ", location=" + location + "]";
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		IRCTC irctc = new IRCTC("Nadeem", 8218, "Bangalore");
		System.out.println(irctc);
	}
}