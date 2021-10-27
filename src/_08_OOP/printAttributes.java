package _08_OOP;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class printAttributes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * You have two classes Main and Atts. Do not touch the Main class. Finish the
		 * Atts class to have attributes:
		 * 
		 * Strings: name, color int: amount Method: asString() (returns String in format
		 * shown below) All attributes should be public
		 * 
		 * Example:
		 * 
		 * Atts a = new Atts(); a.name = "table"; a.color = "brown"; a.amount = 1;
		 * 
		 * System.out.println(a.asString()); copied! Atts a = new Atts(); a.name =
		 * "table"; a.color = "brown"; a.amount = 1;
		 * 
		 * System.out.println(a.asString()); Output
		 * 
		 * name: table color: brown amount: 1
		 */
		
		   Scanner in = new Scanner(System.in);
		   printAttributesClass a = new printAttributesClass();
		   a.name = in.nextLine();
		   a.color = in.nextLine();
		   a.amount = in.nextInt();
		   
		  a.asString();
		  
	}

}
