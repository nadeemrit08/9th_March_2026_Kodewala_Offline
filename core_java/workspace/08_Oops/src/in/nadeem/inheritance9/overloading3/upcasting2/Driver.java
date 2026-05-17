package in.nadeem.inheritance9.overloading3.upcasting2;

class PurchaseMgt {

}

class Purchase extends PurchaseMgt {

}

public class Driver {


	public static void main(String[] args) {
		
		PurchaseMgt pm = new Purchase();

		Purchase p = (Purchase) pm;
		System.out.println("Driver.main()");
	}
}
