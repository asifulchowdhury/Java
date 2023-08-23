/*Write a program that reads a string from the user and then finds the longest 
 * word in the string. The program should print the length of the longest word 
 * and the word itself.*/


package Assignment;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter First word");
		String orginalStr = myObj1.nextLine();
		System.out.println("Enter Second word");
		String reversedStr = myObj2.nextLine();

if(orginalStr.length() > reversedStr.length()) {
	System.out.println("The Longest Word is" +"'"+orginalStr+"'"+"Length: "+orginalStr.length() );
	
}else {
	System.out.println("The Longest Word is" +"'"+ reversedStr+"'"+"Length: "+reversedStr.length());
	}
	
}
}

