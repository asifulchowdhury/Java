/*Write a program that reads two strings from the user and then finds the length 
 * of the longest common substring between the two strings. The program should 
 * print the length of the longest common substring.*/


package Assignment;
import java.util.List;
import java.util.Scanner;
public class Assignment11 {
	public static int lcsubstr(String str1, String str2){
		int ans = 0;

		for (int i = 0; i < str1.length(); i++) 
		{
	         for (int j = 0; j < str2.length(); j++) {
			int k = 0;
			while ((i + k) < str1.length() && (j + k) < str2.length() 
					&& str1.charAt(i + k) == str2.charAt(j + k)) 
			{
				k = k + 1;
			}

			ans = Math.max(ans, k);
		   }
		}
	      return ans;
	  }
	public static void main(String args[]) {
			Scanner myObj1 = new Scanner(System.in);
			System.out.println("Enter the String"); 
			String str = myObj1.nextLine();
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter the String"); 
			String str3 = myObj2.nextLine();
			
				System.out.println(lcsubstr(str, str3));
			}
			
			
	}
