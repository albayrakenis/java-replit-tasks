/**
 * 
 */
package _03_String;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class alejandro_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Alejandro has many emails and only has time to read the emails that refer to
		 * him and a project. Check if his name is found in the email and if project is
		 * also included and if it does print "read", but if his name is not in the
		 * email print "don't read"
		 */

		Scanner s = new Scanner(System.in);
		String a = s.nextLine();

		// your code here
		if (a.equals("alejandro") & a.equals("project")) {
			System.out.println("read");
		} else {
			System.out.println("don't read");
		}

	}

}
