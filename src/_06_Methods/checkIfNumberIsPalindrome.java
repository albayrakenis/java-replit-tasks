package _06_Methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class checkIfNumberIsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Complete the method isPalindrome() that will check if number is a palindrome.
		// Print your result as a boolean (true or false).

		// Challenge: Do not convert int into a string!
		//
		// Examples:
		//
		// input: 1001
		//
		// output: true
		// input: 1001
		//
		// output: true
		// input: 1234
		//
		// output: false
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	}

	public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    if(num%2==1){
	      System.out.println("true");
	    } else {
	      System.out.println("false");
	    }
	    
	  }

}
