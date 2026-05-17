package in.nadeem.stringbuilder;

public class InsertStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" World");
		System.out.println(sb);

		sb.insert(6, "Java ");
		System.out.println(sb);

		sb.delete(5, 10);
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append("X").delete(1, 3).insert(1, "H");
		System.out.println(sb1);
	}
}
