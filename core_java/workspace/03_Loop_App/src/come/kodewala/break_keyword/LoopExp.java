// 31-march-2026
package come.kodewala.break_keyword;

public class LoopExp {

	public static void main(String[] args) {

		System.out.println("Main().......Started");

		LoopExp exp = new LoopExp();
		exp.checkCity();

		System.out.println("Main().......Ended");

	}

	public void checkCity() {
		String cities[] = { "Chennai", "Bangalore", "Delhi", "Ahmedabad", "Jaipur", "Mysore" };

		// Task - check if city(Bangalore) exists in the given array or not.

		for (String city : cities) {
			System.out.println("Loop is running");
			if (city.equalsIgnoreCase("Bangalore")) {
				System.out.println("Banglore exist in given cities");
				break;
			}
		}
	}
}
