/*Write a program that reads a string from the user and checks whether 
 * it is a palindrome or not. A palindrome is a string that reads the 
 * same backward as forward.*/

package Assignment;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter word");
		String orginalStr = myObj.nextLine();
		String reversedStr = "";
		for(int i=0; i< orginalStr.length();i++) {
			reversedStr = orginalStr.charAt(i)+ reversedStr;
		}
		System.out.println("Reversed word: "+ reversedStr);
	if(orginalStr.equals(reversedStr)) {
		System.out.println("It is Palindrome String");
	}
	else {
		System.out.println("It is not a Palindrome String");
	}
	}
}

