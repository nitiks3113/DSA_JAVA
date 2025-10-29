package string;

/*
Given a string of Size N containing digits from 1 to N+1 where any one digit is missing.
Print the missing digit. 
String s=“36521”;
Output: 4
 
*/
import java.util.*;

public class PrintMissingDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		int result = findMissingDigit(str);
		System.out.println("Missing digit is : " + result);
	}

	public static int findMissingDigit(String s) {
		int n = s.length(); // Length of string

		boolean[] present = new boolean[n + 2];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int digit = ch - '0';
			present[digit] = true;
		}

		for (int i = 1; i <= n + 1; i++) {
			if (!present[i]) {
				return i;
			}
		}

		return -1;
	}
}
