/*Write a program that uses try-catch blocks to handle exceptions that may occur 
 * during arithmetic operations. The program should catch any ArithmeticExceptions 
 * that may occur and print an error message.*/

package Exceptions;


	public class ArithmeticExceptionHandling {
	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            int result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("An ArithmeticException occurred: " + e.getMessage());
	        }
	    }
	}
