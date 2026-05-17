package in.nadeem.FI.lambdaexpre2;

/*
main()
│
├── create lambda (Addition implementation)
│
├── call add(20,10)
│
├── execute lambda → return 30
│
└── print 30
*/
@FunctionalInterface
interface Addition {

	public abstract int add(int a, int b);
}

public class SumOfTwoNum {

	public static void main(String[] args) {

		Addition sum = (a, b) -> a + b;

		System.out.println("Sum of Two numbers : " + sum.add(20, 10));
	}
}
