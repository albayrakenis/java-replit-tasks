package _04_Loops;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class printStarNtimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// NOT SOLVED
		
		// Given an int variable n print out n asterisks. So if n=5, five asterisks will
		// be printed.

		// Example:
		//
		// input: 1
		//
		// output: *
		// input: 1
		//
		// output: *
		// Example:
		//
		// input: 3
		//
		// output: ***

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// WRITE YOUR CODE HERE

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}

}
