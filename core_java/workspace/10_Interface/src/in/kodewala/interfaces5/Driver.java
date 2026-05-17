package in.kodewala.interfaces5;

interface Animal {
	void makeSound();

	static void info() {
		System.out.println("Animal.info()");
	}
}

class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog.makeSound()");

	}

}

public class Driver {

	public static void main(String[] args) {

		Animal.info();

		Dog a = new Dog();
		a.makeSound();
	}
}
