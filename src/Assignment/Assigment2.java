/*Write a program that reads two strings from the user and checks whether they 
 * are anagrams or not. Anagrams are two strings that contain the same characters 
 * in a different order.*/

package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Assigment2 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter First word");
		String orginalStr = myObj1.nextLine();
		System.out.println("Enter Second word");
		String reversedStr = myObj2.nextLine();

if(orginalStr.length() != reversedStr.length()) {
	System.out.println("These two word are not anagram");
	
}else {
	char c1[]= orginalStr.toCharArray();
	char c2[]= reversedStr.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	if (Arrays.equals(c1,c2)) {
		System.out.println("These two word are anagram");
	}else {
		System.out.println("These two word are not anagram");
	}
	
}
}
}
