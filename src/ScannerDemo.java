/*
 * This class demonstrates the usage of a switch statement and how to use a scanner to get the user input. 
 */

import java.util.Scanner;
public class ScannerDemo {
	
	public static void main(String[] args) {
		// creating scanner object to take in user input.
		Scanner scanner = new Scanner(System.in); 
	    System.out.println("What is your favorite color?");
	    String color = scanner.nextLine();
	    color = color.toLowerCase();
	    // similar functionality to if else statement
	    switch(color) {
	    	case "blue": 
	    		System.out.println("That is my favorite color too!");
	    		break; 
	    		
	    	case "purple":
	    		System.out.println("Good pick.");
	    		break;
	    		
	    	case "black":
	    		System.out.println("That's pretty edgy.");
	    		break;
	    		
	    	default: 
	    		System.out.println("Oh okay. That's nice.");
	    		break; 
	    }
	    
	    // closing scanner to prevent memory leak
	    scanner.close();
	}
}
