package string;

/*
 WAJP to take a String input and check whether the String is a Palindrome String or not(with reversing). 
*/
import java.util.*;

public class CheckPalindromeWithReversing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		checkPalindrome(str);
	}

	public static void checkPalindrome(String str) {
		String rev = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("The given String \"" + str + "\" is a palindrome.");
		} else {
			System.out.println("The given String is not a palindrome.");
		}
	}
}
