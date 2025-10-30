package string;

/*
 Design a method which will accept a String input and return the reverse of the String. 
*/
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		reverseString(str);
	}

	public static void reverseString(String str) {
		String rev = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reversed String is : " + rev);
	}
}
