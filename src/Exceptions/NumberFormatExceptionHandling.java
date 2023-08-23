/*Write a program that reads a string from the user and parses it into an integer. 
 * The program should catch any NumberFormatExceptions that may occur and print 
 * an error message.*/


package Exceptions;


	import java.util.Scanner;

	public class NumberFormatExceptionHandling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        String userInput = scanner.nextLine();

	        try {
	            int number = Integer.parseInt(userInput);
	            System.out.println("Parsed number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}

