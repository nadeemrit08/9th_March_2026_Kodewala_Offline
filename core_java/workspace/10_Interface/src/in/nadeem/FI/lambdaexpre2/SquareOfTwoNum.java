package in.nadeem.FI.lambdaexpre2;

/*
	main()
	│
	├── load functional interface
	│
	├── create lambda implementation
	│
	├── assign to square
	│
	├── call find(5)
	│
	├── compute 5 * 5
	│
	└── print 25
*/
interface ISquare {

	int find(int num);
}

public class SquareOfTwoNum {

	public static void main(String[] args) {

		ISquare square = num -> num * num;
		System.out.println("Square of Two Num : " + square.find(5));
	}
}
