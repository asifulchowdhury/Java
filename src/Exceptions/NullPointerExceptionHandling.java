package Exceptions;


	import java.util.Scanner;

	public class NullPointerExceptionHandling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        try {
	            String upperCaseString = userInput.toUpperCase();
	            System.out.println("Uppercase string: " + upperCaseString);
	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}
