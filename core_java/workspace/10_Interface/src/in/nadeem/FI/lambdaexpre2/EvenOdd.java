package in.nadeem.FI.lambdaexpre2;

/*	
	main()
	│
	├── load EvenOdd interface
	│
	├── create lambda implementation
	│
	├── assign to iObj
	│
	├── call check(8)
	│
	├── evaluate 8 % 2 == 0
	│
	└── print true
*/
@FunctionalInterface
interface IEvenOdd {

	boolean check(int number);
}

public class EvenOdd {

	public static void main(String[] args) {

		IEvenOdd iObj = number -> number % 2 == 0;
		
		System.out.println(iObj.check(8));
	}
}
