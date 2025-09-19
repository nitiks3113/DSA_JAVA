package loops.whileloop.whileloop3;

// Write a java program to take a String input and check whether the given String is a palindrome String or not(Without reversing)

import java.util.Scanner;

public class CheckPalindromeWithoutReverse {
// This is very good question of two pointer approach.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		boolean string = CheckPalindrome(str);
		if (string) {
			System.out.println("Palidrome String");
		} else {
			System.out.println("Not a Palindrome String.");
		}
		sc.close();

	}

	public static boolean CheckPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
