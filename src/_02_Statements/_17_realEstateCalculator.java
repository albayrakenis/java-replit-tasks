package _02_Statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _17_realEstateCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// NOT SOLVED
		
		// This program should work with 3 house types:

		// Condo, Townhouse and Single Family Home.
		// Starting price for Condo = 50000, for Townhouse = 75000, Single Family Home =
		// 95000.
		// Based on number of bedroom:
		// add 30000 for every bedroom
		// Then you need to ask if property has backyard.
		// Add 5000 to the property price if it's true. Backyard shouldn't be available
		// for Condo, so display message "Backyard is not available for condo!", (don't
		// increase property price!), in case someone would try to select backyard for
		// condo.
		// Then ask user if there is a garage or not.
		// If the property has garage, add 20000 to the property price for every spot.
		// If amount of garage spots exceeds 10 spots (greater then 10), display
		// message: "Pardon, it's not public parking!" and don't increase property
		// price.
		// Then, ask user for metro accessibility.
		// If metro is closer than 1 mile (inclusive), add 10000to the property price.
		// If metro is in the radius from 1 mile to 3 miles, add to the property price
		// 5000.
		// Then, ask user for highway accessibility.
		// If highway is closer than 1 mile (inclusive), add 15000 to the property
		// price. If highway is in the radius from 1 to 5 miles, add 8000 to the
		// property price. And if highway is in the radius from 5 mile to 20 miles
		// (inclusive), add 4000 to the property price.
		// Then your program should ask about nearest school rating.
		// If school's rating is in the range from 10 (inclusive) to 8 points, add 45000
		// to the property price. If school's rating is less than 8 points and more or
		// equals to 4 points, add 20000 to the property price. Otherwise, add 5000 to
		// the property price.
		// Then, ask user if any of the family members smoke. If so, reduce property
		// price by 5000.
		// At the end, display message: "Market report has been generated.", and display
		// underneath: "Your estimate market price is: propertyPrice$"
		// DO NOT CHANGE
		int propertyPrice = 0;
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		// WRITE YOUR CODE HERE

	}

}
