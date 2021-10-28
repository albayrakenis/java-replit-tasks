/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class printFirstAndLastLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Write a program that will print out first and last letters together.
		 * 
		 * Input: adobe Output: ae
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.print(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));
	}

}
