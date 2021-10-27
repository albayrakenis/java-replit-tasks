package _02_Statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _11_videoGameCoupons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SOLVED
		// The video games machines at your local arcade outputs coupons according to
		// how well you play the game.

		// You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
		// Write a program that displays how many candy bars and gumballs you can get.
		// You perfer candy bars.
		// if you the coupons are not enough for any redeem, display message:
		// "Not enough coupons"
		// Example:
		//
		// Input:
		// Enter number of coupons:
		// 13
		//
		// Output: Number of Candies: 1
		// Output: Number of Gumballs: 1

		// Write your code here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupon = scan.nextInt();

		int candyBar = coupon / 10;
		int gumballs = coupon % 10 / 3;

		if (coupon >= 3) {
			System.out.println("Number of Candies: " + candyBar);
			System.out.println("Number of Gumballs: " + gumballs);
		} else {
			System.out.println("Not enough coupons");
		}

	}

}
