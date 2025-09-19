package loops.whileloop.whileloop3;

import java.util.Scanner;

// Write a java program to take a user input and print the sum of factorial of each digits of the number.
public class DigitFactorialSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int sum = 0;
		while (num > 0) {
			temp = num % 10;
			sum = sum + Factorial(temp);
			num /= 10;
		}
		System.out.println("The Sum of the Factorial of the digits is : " + sum);
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
