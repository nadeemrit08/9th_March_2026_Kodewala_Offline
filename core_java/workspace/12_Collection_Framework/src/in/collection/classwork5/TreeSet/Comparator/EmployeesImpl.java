package in.collection.classwork5.TreeSet.Comparator;

import java.util.Comparator;

public class EmployeesImpl implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {

		return e1.firstName.compareTo(e2.firstName);
	}

}
