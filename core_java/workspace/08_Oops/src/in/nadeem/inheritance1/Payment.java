package in.nadeem.inheritance1;

class Payment {
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Processing generic payment of: " + amount);
    }
}
