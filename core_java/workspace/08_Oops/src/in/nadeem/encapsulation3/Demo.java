package in.nadeem.encapsulation3;

class Demo {
	private int data;

	/*
	 * public Demo(int data) { super(); this.data = data; }
	 */

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.getData());
	}
}