/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _04_printFirstCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Write a program that will print out the first character of the word.
		 * 
		 * Ex:
		 * Input: jump 
		 * Output: j
		 */

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    System.out.println(word.charAt(0));
	}

}
