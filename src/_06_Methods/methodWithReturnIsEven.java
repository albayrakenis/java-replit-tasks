package _06_Methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class MethodWithReturnIsEven {

	/**
	 * @param args
	 */
	public static boolean isEven(int n) {
	    if(n%2==0){
	        return true;
	      } else {
	        return false;
	      }
	}

	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// isEven accepts a number and checks if it is even.
		// If the given number is even return true, otherwise return false.

		// Examples:
		//
		// isEven(1) --> false
		// isEven(1) --> false
		// isEven(8) --> true

		Scanner in = new Scanner(System.in);
		System.out.println(isEven(in.nextInt()));

	}

}
