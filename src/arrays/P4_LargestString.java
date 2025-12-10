package arrays;

/**
 * For the given array of Strings, print the largest string.
 */

import java.util.Scanner;

public class P4_LargestString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the String Array : ");
		int s1 = sc.nextInt();
		String[] str = new String[s1];

		System.out.println("Enter the elements in the String array : ");
		for (int i = 0; i < s1; i++) {
			str[i] = sc.next();
		}
		displayString(str);
		System.out.println();
		maxLengthString(str);
	}

	public static void displayString(String[] str) {
		int n = str.length;
		for (int i = 0; i < n; i++) {
			System.out.print(str[i] + ",  ");
		}
	}

	public static void maxLengthString(String[] str) {
		int n = str.length;
		int maxLen = 0;
		int currLen = 0;
		for (int i = 0; i < n; i++) {
			String s1 = str[i];
			currLen = s1.length();

			if (currLen >= maxLen) {
				maxLen = currLen;
			}
		}

		System.out.println("Maximum Length of a String in the Array is : " + maxLen);
	}
}
