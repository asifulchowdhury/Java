/*Write a program that reads a string from the user and then converts it to title 
 * case. Title case means that the first letter of each word in the string is 
 * capitalized.*/

package Assignment;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the word");
		String orgString = myObj1.nextLine();
		System.out.println("Title Case: "+orgString.substring(0,1).toUpperCase()+orgString.substring(1));
	}
}
