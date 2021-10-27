package _02_Statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _10_positiveNegativeOrZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SOLVED
		// Given int num check if the number is positive, negative, or zero

		// Hint: use 3 if statements to do this
		//
		// Examples:
		//
		// num = 1
		//
		// positive
		//

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		// your code here
		if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
	}

}
