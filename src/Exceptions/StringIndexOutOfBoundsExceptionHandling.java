package Exceptions;


	import java.util.Scanner;

	public class StringIndexOutOfBoundsExceptionHandling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        try {
	            // Check if the input string contains "example"
	            boolean containsSubstring = userInput.contains("example");

	            if (containsSubstring) {
	                System.out.println("The string contains the substring 'example'.");
	            } else {
	                System.out.println("The string does not contain the substring 'example'.");
	            }
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}

