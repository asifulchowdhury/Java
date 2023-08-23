/*Write a program that reads a string from the user and then removes all the 
 * white spaces from the string. The program should then print the new string.*/

package Assignment;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the word");
		String orgString = myObj1.nextLine();
		System.out.println("After removing all Space: "+orgString.replaceAll("\\s", ""));
}
}
