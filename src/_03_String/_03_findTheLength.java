/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _03_findTheLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Write a program that will output length of the text (string).
		 * 
		 * Example:
		 * 
		 * Display message: "Please enter the text:"  
		 * input: java  
		 * Display message: "Length is: 4"
		 * 
		 */
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter the text:");
	    String input = sc.nextLine();

	    System.out.println("Length is: " + input.length());




	}

}
