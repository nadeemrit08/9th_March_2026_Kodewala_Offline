package in.nadeem.encapsulation3;

public class Test {

	private int num = 10;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		num = num;
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.setNum(50);
		System.out.println(t.getNum());
	}
}
