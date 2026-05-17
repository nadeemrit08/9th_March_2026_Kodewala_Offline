package in.nadeem.inheritance1;

class UpiPayment extends Payment {
	private String upiId;

	public UpiPayment(double amount, String upiId) {
		super(amount);
		this.upiId = upiId;
	}

	public void pay() {
		System.out.println("Paid " + amount + " using UPI ID: " + upiId);
	}
}
