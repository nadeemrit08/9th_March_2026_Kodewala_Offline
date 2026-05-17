package in.nadeem.inheritance8.overiding2.mul.inheritance;

class GrandFather {
	public void sounds() {
		System.out.println("Father.sounds()");
	}
}

class Father extends GrandFather {
	public void sounds() {
		System.out.println("Father.sounds()");
	}
}

class Uncle extends GrandFather {
	public void sounds() {
		System.out.println("Father.sounds()");
	}
}

class Son extends Father{
	
}

public class Family {

}
