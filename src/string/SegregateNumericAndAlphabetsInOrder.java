package string;

/*
 WAJP to take a String input and segregate alphabets and numeric digits while maintaining the order of characters.
i/p: “a4cdx37d2b”
o/p: “acdxdb4372” 
*/

import java.util.*;

public class SegregateNumericAndAlphabetsInOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		printSegregateNumAndAlph(str);
	}

	public static void printSegregateNumAndAlph(String str) {
		String digit = "";
		String alph = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57)
				digit = digit + ch;
			else
				alph = alph + ch;
		}
		System.out.println("Segregated String in Order is : " + alph + digit);
	}
}
