/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class stringNoEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a String txt print the value without the last letter
		 */

		Scanner s = new Scanner(System.in);
		String txt = s.next();

		int last = txt.length() - 1;
		System.out.println(txt.substring(0, last));

	}

}
