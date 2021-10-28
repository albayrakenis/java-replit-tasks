/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class printLastCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
