package come.kodewala.switch_statement;

public class Customer {

	public static void main(String[] args) {

		String type = "Platinum";

		switch (type) {
		case "Gold":
			System.out.println("Customer will get 10% dicount");
			break;
		case "Silver":
			System.out.println("Customer will get no dicount");
			break;
		case "Platinum":
			System.out.println("Customer will get 15 dicount");
			break;
		default:
			break;
		}
	}
}
