package in.nadeem.FI.lambdaexpre2;

/*	main()
	│
	├── load functional interface
	│
	├── create lambda implementation
	│
	├── assign to uppercase
	│
	├── call convert("Nadeem")
	│
	├── execute toUpperCase()
	│
	└── print "NADEEM"
*/
@FunctionalInterface
interface IUpperCase {

	String convert(String str);
}

public class StringUppercase {

	public static void main(String[] args) {

		IUpperCase uppercase = str -> str.toUpperCase();

		String convert = uppercase.convert("Nadeem");
		System.out.println(convert);
	}
}
