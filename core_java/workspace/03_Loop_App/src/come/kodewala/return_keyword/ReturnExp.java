package come.kodewala.return_keyword;

import come.kodewala.break_keyword.LoopExp;

public class ReturnExp {

	public static void main(String[] args) {

		System.out.println("Main().......Started");

		LoopExp exp = new LoopExp();
		exp.checkCity();

		System.out.println("Main().......Ended");

	}

	public void checkCity() {
		String cities[] = { null, "Chennai", "Bangalore", "Delhi", "Ahmedabad", "Jaipur", "Mysore" };

		// Task - check if city(Bangalore) exists in the given array or not.

		for (String currentCity : cities) {

			if (currentCity == null) {
				System.out.println(" null city found... exiting from the method");
				return;
			}

			if (currentCity.equalsIgnoreCase("Bangalore")) {
				System.out.println("Banglore exist in given cities");
				break;
			}
		}
	}
}
