package in.kodewala.functionalInterface9;

public class CalculateFactorial {
	public static void main(String[] args) {

		// Lambda implementation
		Factorial fact = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		int num = 5;
		System.out.println("Factorial of " + num + " is: " + fact.calculate(num));
	}
}
