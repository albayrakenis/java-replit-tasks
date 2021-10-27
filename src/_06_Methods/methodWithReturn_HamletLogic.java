package _06_Methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class methodWithReturn_HamletLogic {

	/**
	 * @param args
	 */
	public static boolean hamletQuote(boolean toBe, boolean notToBe) {
		// your code here
		if (toBe == true & notToBe == true) {
			return true;
		} else if (toBe == true & notToBe == false) {
			return true;
		} else if (toBe == false & notToBe == true) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
	}

}
