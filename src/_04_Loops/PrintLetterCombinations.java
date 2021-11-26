package _04_Loops;

/**
 * @author esalkan
 *
 */
public class PrintLetterCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (char i = 'z'; i >= 'v'; i--) {
			for (char j = 'z'; j >= 'v'; j--) {
				System.out.print(i);
				System.out.print(j);
				System.out.println();
			}
		}

	}

}
