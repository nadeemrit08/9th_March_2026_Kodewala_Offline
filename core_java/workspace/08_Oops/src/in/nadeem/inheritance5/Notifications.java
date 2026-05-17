package in.nadeem.inheritance5;

public class Notifications {

	String countryName = "India"; // Field OR Attribute --> Data

	public void sendEmail(String email, String text, String attachment) { // Task
		System.out.println("Notifications.sendEmail()");
	}

	public void sendSMS(String mobile, String text) {
		System.out.println("Notifications.sendSMS()");
	}
}
