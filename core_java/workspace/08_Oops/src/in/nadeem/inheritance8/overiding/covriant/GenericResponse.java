package in.nadeem.inheritance8.overiding.covriant;

public class GenericResponse {

	public GenericResponse(String message) {

	}
}

class UPIResponse extends GenericResponse {

	public UPIResponse(String message, String code) {
		super(message);

	}

}
