/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class VerifyContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed

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
