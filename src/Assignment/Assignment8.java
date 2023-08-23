/*Write a program that reads a string from the user and then checks whether it is
 * a pangram or not. A pangram is a string that contains all the letters of the 
 * alphabet.*/

package Assignment;
import java.util.Scanner;
public class Assignment8 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter the String"); 
		String S = myObj1.nextLine();
	
		
		boolean[] mark = new boolean [26];
		boolean pangram = true;
		int index = 0;
		for(int i=0; i<S.length(); i++) {
			char cur = S.charAt(i);
			if (cur>='A' && cur<='Z') {
				index = cur-'A';
			}else if (cur >='a' && cur <= 'z') {
				index = cur-'a';
			}
		mark[index]=true;
		}
		for(int i= 0; i<mark.length; i++) {
			if(mark[i]== false) {
				pangram = false;
			}
		}
		 if (pangram) {
			 System.out.println("It is a pangram.");
		 }else {
			 System.out.println("It is not a pangram.");
		 }
	}
}
	