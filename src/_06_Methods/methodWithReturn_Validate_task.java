package _06_Methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class methodWithReturn_Validate_task {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * We have a to do list app, every time a user adds a task - a few things needed
		 * to be checked.
		 * 
		 * It should not be empty. (boolean parameter needs to be true) taskId should be
		 * only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
		 * so the next task id is 8 , it can't be 10. Example:
		 * 
		 * validateTask(true,2,1)
		 * 
		 * returns true validateTask(true,2,1)
		 * 
		 * returns true validateTask(true,3,1)
		 * 
		 * returns false validateTask(true,3,1)
		 * 
		 * returns false validateTask(false,3,2)
		 * 
		 * returns false
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));

	}

	public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
		// your code here
		if (notEmpty & (taskId - 1 == currentId)) {
			return true;
		} else {
			return false;
		}
	}

}
