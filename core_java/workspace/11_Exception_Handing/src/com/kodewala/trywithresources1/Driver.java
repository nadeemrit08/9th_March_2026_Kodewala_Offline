package com.kodewala.trywithresources1;

class MyResource implements AutoCloseable {

	public void display() {
		System.out.println("MyResource.display() :: Resource is being used");
	}

	@Override
	public void close() throws Exception {
		System.out.println("MyResource.close() :: Resource closed automatically");

	}

}

public class Driver {

	public static void main(String[] args) {

		try (MyResource myResource = new MyResource()) {
			myResource.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
