/*Write a program that reads a string from the user and then counts the number of 
 * vowels in the string. The program should print the number of vowels.*/

package Assignment;
import java.util.Scanner;
public class Assignment7 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String orginalStr = myObj1.nextLine();
		char[] chars = orginalStr.toCharArray();
		
		int count = 0;
		
		for (char c: chars) {
			switch(c){
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
				break;
				default:
					
			}
		}
		System.out.println("Number of vowel in String: "+count);
}
}

