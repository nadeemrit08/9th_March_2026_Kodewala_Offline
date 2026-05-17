package in.kodewala.functionalInterface7;

@FunctionalInterface
public interface MyInterface { // SAM interface()--> single abstractmethod

	public abstract String doSomething(); // public abstract string doSomething();

	public default void doNothing() {

	}
}
