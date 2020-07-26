/*
 * Some information about the program.
 */

package MyException;

import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1 26 July 2020
 */

public class Main {

	public static void main(String[] args) throws MyException {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("¬вед≥ть перше ц≥ле число:");

		a = scanner.nextInt();

		System.out.println("¬вед≥ть друге ц≥ле число:");

		b = scanner.nextInt();

		try {
			Methods result = new Methods(a, b);
			result.plus();
			result.minus();
			result.multiply();
			result.devide();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("Resources are closed.");
		}

//		Methods result1 = new Methods(-20, -5);
//		result1.plus();
//		result1.minus();
//		result1.multiply();
//		result1.devide();
//		System.out.println();

//		Methods result2 = new Methods(20, 0);
//		result2.plus();
//		result2.minus();
//		result2.multiply();
//		result2.devide();
//		System.out.println();

//		Methods result3 = new Methods(0, 5);
//		result3.plus();
//		result3.minus();
//		result3.multiply();
//		result3.devide();
//		System.out.println();

//		Methods result4 = new Methods(0, 0);
//		result4.plus();
//		result4.minus();
//		result4.multiply();
//		result4.devide();
//		System.out.println();

//		Methods result5 = new Methods(20, -5);
//		result5.plus();
//		result5.minus();
//		result5.multiply();
//		result5.devide();
//		System.out.println();

//		Methods result6 = new Methods(20, 5);
//		result6.plus();
//		result6.minus();
//		result6.multiply();
//		result6.devide();
//		System.out.println();

	}

}
