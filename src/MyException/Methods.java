/*
 * Some information about the program.
 */

package MyException;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  26 July 2020
 */

public class Methods {
	
	private static int a;
	private static int b;
	
	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	/**
	 * Adds two numbers. 
	 * 
	 * @param a, b
	 * @return result a+b
	 * @throws MyException 
	 * 
	 */
	
	public void plus() throws MyException {
		Methods.check();
		System.out.println(a + b);
	}

	/**
	 * Subtracts two numbers
	 * 
	 * @param a, b
	 * @return result a-b
	 * @throws MyException
	 * 
	 */

	public void minus() throws MyException {
		Methods.check();
		System.out.println(a - b);
	}
	
	/**
	 * Multiply two numbers. 
	 * 
	 * @param a, b
	 * @return result a*b
	 * @throws MyException 
	 * 
	 */
	
	public void multiply() throws MyException {
		Methods.check();
		System.out.println(a * b);
	}
	
	/**
	 * Divides two numbers.
	 * 
	 * @param a, b
	 * @return result a/b
	 * @throws MyException 
	 * 
	 */
	
	public void devide() throws MyException {
		Methods.check();
		System.out.println(a / b);
	}
	
	
	/**
	 * Describe exceptions.
	 * 
	 * @param a, b
	 * @throws MyException 
	 * 
	 */
	
	static void check() throws MyException {
		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}
		if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
			throw new ArithmeticException();
		}
		if ((a == 0) && (b == 0)) {
			throw new IllegalArgumentException();
		}
		if ((a > 0) && (b > 0)) {
			throw new MyException("Opps! a > 0 and b > 0");
		}
	}
	
}
