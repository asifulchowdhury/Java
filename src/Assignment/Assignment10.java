/*Write a program that reads a string from the user and then checks whether it is
 * a valid email address or not. The program should print "true" if the string is
 * a valid email address and "false" otherwise.*/


package Assignment;
import java.util.Scanner;
public class Assignment10 {
	static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	   public static void main(String[] args) {
		   Scanner myObj1 = new Scanner(System.in);
			System.out.println("Enter the email address:"); 
			String Str = myObj1.nextLine();
		   
	
	     
	      System.out.println("Is the above E-mail ID valid? " + isValid(Str));
	   }
}