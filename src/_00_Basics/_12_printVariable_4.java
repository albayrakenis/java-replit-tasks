package _00_Basics;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _12_printVariable_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SOLVED
		// Given a String variable word assume the variable has a value and use it to
		// display the word of the day.

		// Ex: Input: Java
		// Output: Today's word of the day is: Java
		// Ex: Input: Apple
		// Output: Today's word of the day is: Apple

		String word = new Scanner(System.in).nextLine();
		// Write Your code here:
		System.out.println("Today's word of the day is: " + word);
	}

}
