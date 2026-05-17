package in.kodewala.interfaces;

public interface IBanking { // 100% abstract

	public abstract void pay();

	public abstract void settle();

	void addapyee();

	void modifyPayee(); // by default all the methods in interface are public and abstract

	void doKYC();
}
