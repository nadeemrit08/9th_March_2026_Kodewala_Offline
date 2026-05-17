package come.kodewala.switch_statement;

public class SwitchExp {

	public static void main(String[] args) {

		int day = 12;

		switch (day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("TH");
			break;
		case 5:
			System.out.println("FRI");
			break;
		default:
			System.out.println(" Unknown day!");
			break;
		}
	}
}
