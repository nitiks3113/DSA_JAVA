package arrays;

/**
 * For the given array of Strings, print the length of all the Strings.
 */
import java.util.Scanner;

public class P3_LengthOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the String Array : ");
		int s1 = sc.nextInt();
		String[] str = new String[s1];

		System.out.println("Enter the Strings in the Array : ");
		for (int i = 0; i < s1; i++) {
			str[i] = sc.next();
		}

		displayString(str);
		System.out.println();
		printLength(str);
	}

	public static void displayString(String[] str) {
		int n = str.length;
		for (int i = 0; i < n; i++) {
			System.out.print(str[i] + ",  ");
		}
	}

	public static void printLength(String[] str) {
		int n = str.length;

		for (int i = 0; i < n; i++) {
			String s1 = str[i];
			System.out.println("Length of the " + str[i] + " is: " + s1.length());
		}
	}
}
