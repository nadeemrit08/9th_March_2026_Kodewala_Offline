package in.kodewala.functionalInterface10;

public class CalculateSquareRoot {

	public static void main(String[] args) {

		SquareRoot sqrt = (n) -> Math.sqrt(n);

		int num = 729;
		System.out.println("Square root of " + num + " is: " + sqrt.find(num));
	}

}
