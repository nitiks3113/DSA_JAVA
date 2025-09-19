package loops.whileloop.whileloop3;

import java.util.Scanner;

// Write a java program to take a user input and print whether the number is a strong number or not.
public class CheckStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int sum = 0;
		int originalNum = num;
		while (num > 0) {
			temp = num % 10;
			sum = sum + Factorial(temp);
			num /= 10;
		}
		if (sum == originalNum && sum != 0) {
			System.out.println(originalNum + " is a Strong Number.");
		} else {
			System.out.println("Not a Strong Number.");
		}
		sc.close();
	}

	public static int Factorial(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

}
