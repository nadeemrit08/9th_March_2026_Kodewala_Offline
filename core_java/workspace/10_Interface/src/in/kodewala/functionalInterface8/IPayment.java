package in.kodewala.functionalInterface8;

public interface IPayment {

	void pay();
}

@FunctionalInterface
interface MPayment extends IPayment {

	//void transaction();
}
