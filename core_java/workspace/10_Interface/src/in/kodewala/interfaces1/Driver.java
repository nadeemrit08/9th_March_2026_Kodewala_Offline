package in.kodewala.interfaces1;

interface IAccoutMgmt {

	// class --> (what + how)-->abstract class --> what/(what+how) --> interface -->what(100%)
	
	public void createAccount(); // what?

	public void modifyAccount();// what?

	public void suspendAccount();// what?

	public void deleteAccount();// what?
}

class RetailUser implements IAccoutMgmt {

	@Override
	public void createAccount() { // How?
		System.out.println("RetailUser.createAccount()");
	}

	@Override
	public void modifyAccount() { // How?
		System.out.println("RetailUser.modifyAccount()");
	}

	@Override
	public void suspendAccount() { // How?
		System.out.println("RetailUser.suspendAccount()");
	}

	@Override
	public void deleteAccount() { // How?
		System.out.println("RetailUser.deleteAccount()");
	}

}

public class Driver {

	public static void main(String[] args) {

	}
}
