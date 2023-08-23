/*Write a program that reads a string from the user and then checks whether it 
 * contains only digits or not. The program should print "true" if the string 
 * contains only digits and "false" otherwise.*/

package Assignment;
import java.util.Scanner;
public class Assignment9 {
	public static boolean onlyDigits(String str, int n) {
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the String"); 
		String str = myObj1.nextLine();
		int len = str.length();
		System.out.println(onlyDigits(str, len));
	}
}
