package in.kodewala.functionalInterface10;

@FunctionalInterface
interface StringConverter {
	String convert(String str);
}

public class UppercaseService {
	public static void main(String[] args) {

		String input = "hello world";

		// Lambda
		StringConverter toUpper = str -> str.toUpperCase();

		String uppercaseString = toUpper.convert(input);

		System.out.println("Uppercase: " + uppercaseString);
	}
}