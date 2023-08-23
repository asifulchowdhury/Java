/*Write a program that reads a string from the user and then replaces all the 
 * vowels in the string with the letter 'x'. The program should then print the 
 * new string.*/


package Assignment;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String orginalStr = myObj1.nextLine();
		System.out.println("After replace vowel of the String:"+validate(orginalStr, 'x'));
	}

public static String validate(String orgiString, char chr) {
return orgiString.replaceAll("[aeiou]", "" + chr);
}
}