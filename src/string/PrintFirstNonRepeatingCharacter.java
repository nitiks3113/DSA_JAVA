package string;

/*
 * Design a method which will return the index of first non-repeating character of the String. Return -1 if no such character is found.
 */

import java.util.*;

public class PrintFirstNonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		getFirstChar(str);
	}

	public static int getFirstChar(String str) {

		if (str.isEmpty()) {
			System.out.println("String is Empty.");
			return -1;
		}

		int[] freq = new int[256];
		for (char c : str.toCharArray()) {
			freq[c]++;
		}

		for (int i = 0; i < str.length(); i++) {
		}
		return -1;
	}
}
