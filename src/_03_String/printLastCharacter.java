package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintLastCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed

		/**
		 * Write a program that will print out last letter of the word (string).
		 * 
		 * Ex:
		 * Input: java 
		 * Output: a
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(word.charAt(word.length() - 1));

	}

}
