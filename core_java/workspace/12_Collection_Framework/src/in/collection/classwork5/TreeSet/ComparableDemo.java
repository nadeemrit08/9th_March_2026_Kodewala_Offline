package in.collection.classwork5.TreeSet;

import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int salary;

	public Student(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Student s) {
		int result = this.name.compareTo(s.name);

		if (result != 0) {
			return result;
		}
		return Integer.compare(this.salary, s.salary);
	}

	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", salary=" + salary + "]"; }
	 */

}

public class ComparableDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Nadeem", 12000);
		Student s2 = new Student("Nadeem", 40000);
		Student s3 = new Student("Raju", 6000);

		TreeSet<Student> students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		System.out.println(students);

		for (Student student : students) {
			System.out.println(" Name : " + student.name + " " + " Salary : " + student.salary);
		}

	}
}
