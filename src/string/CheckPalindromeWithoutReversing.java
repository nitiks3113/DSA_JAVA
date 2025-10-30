package string;

/*
 WAJP to take a String input and check whether the String is a Palindrome String or not(without reversing). 
*/
import java.util.*;

public class CheckPalindromeWithoutReversing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		boolean res = checkPalidromeWithoutReversing(str);
		if (res)
			System.out.println("The given String is a Palindrome String.");
		else
			System.out.println("The given String is not a Palindrome String.");
	}

	public static boolean checkPalidromeWithoutReversing(String str) {
		str = str.toLowerCase();
		int n = str.length();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != (str.charAt(end)))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
