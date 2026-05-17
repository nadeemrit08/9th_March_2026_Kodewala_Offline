package in.nadeem.FI.lambdaexpre2;

/*
	main()
	│
	├── load ILength interface
	│
	├── create lambda implementation
	│
	├── assign to iLength
	│
	├── call length("Nadeem")
	│
	├── compute string length
	│
	└── print 6
*/
interface ILength {

	int legth(String str);
}

public class CalculateLegth {

	public static void main(String[] args) {

		ILength iLength = str -> str.length();
		
		int legth = iLength.legth("Nadeem");
		System.out.println(legth);
	}
}
