package Lab5;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();//Acquiring the parent class methods
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}