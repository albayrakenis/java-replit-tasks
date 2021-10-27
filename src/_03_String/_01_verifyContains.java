/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _01_verifyContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Write a program that will verify if the sentence contains word. Print out the
		 * result as a boolean value.
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();

		if (sentence.contains(word)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
