package in.nadeem.inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sounds();
		
		Dog dog = new Dog();
		dog.sounds();
		dog.bark();
	}
}
