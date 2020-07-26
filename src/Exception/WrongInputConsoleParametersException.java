/*
 * Some information about the program.
 */

package Exception;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  26 July 2020
 */

public class WrongInputConsoleParametersException extends Exception {
	
	private String errorMessage;

	public WrongInputConsoleParametersException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return errorMessage;
	}
}
