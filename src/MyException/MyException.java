/*
 * Some information about the program.
 */

package MyException;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  26 July 2020
 */

public class MyException extends Exception {

	private String errorMessage;

	public MyException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return errorMessage;
	}
}
