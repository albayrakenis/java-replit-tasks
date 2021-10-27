package _04_Loops;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// In mathematics a factorial of a positive integer n, denoted by n!, is the
		// product of all positive integers less than or equal to n. Calculate factorial
		// and output result to the console.

		// Example:
		//
		// input: 5
		// output: 120
		//
		// 5 * 4 * 3 * 2 * 1
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();

	    long counter = 1;

	    for(int start = 1; start <= n; start++){
	      counter = counter * start;
	    }
	    System.out.println(counter);
		
	}

}
