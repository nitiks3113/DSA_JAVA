package patternProgramming;

// WAJP to take user input and check the number is palindrome or not.
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check Palindrome : ");
		int n = sc.nextInt();
		sc.close();
		checkPalindrome(n);
	}

	public static void checkPalindrome(int n) {
		int revNum = reverseNumber(n);
		if (revNum == n)
			System.out.println(n + " is a Palindrome Number.");
		else
			System.out.println(n + " is not a Palindrome Number.");
	}

	public static int reverseNumber(int n) {
		int temp = 0;
		int revNum = 0;
		while (n > 0) {
			temp = n % 10;
			revNum = revNum * 10 + temp;
			n /= 10;
		}
		return revNum;
	}
}
