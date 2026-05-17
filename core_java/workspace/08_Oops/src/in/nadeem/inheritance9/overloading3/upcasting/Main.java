package in.nadeem.inheritance9.overloading3.upcasting;

class Company {

}

class Employee extends Company {

}

public class Main {

	Company company = new Company();

	Company company2 = new Employee(); // auto up-casting

	Employee employee = (Employee) new Company(); // down-casting
}
