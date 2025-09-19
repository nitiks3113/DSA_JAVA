package loops.whileloop.whileloop3;

import java.util.Scanner;

// Write a java program to take a user input andprint whether the number is a palindrome number or not.
public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int revNum = 0;
		int originalNum = num;
		int temp;
		while (num > 0) {
			temp = num % 10;
			revNum = revNum * 10 + temp;
			num /= 10;
		}
		System.out.println("The Revese of the number : " + originalNum + " is : " + revNum);

		if (revNum == originalNum) {
			System.out.println("The number : " + originalNum + " is a Palindrome number.");
		} else {
			System.out.println("Not a Palindrome number.");
		}
		sc.close();
	}

}
