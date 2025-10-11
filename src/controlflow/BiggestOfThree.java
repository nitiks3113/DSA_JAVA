package controlflow;

// WAJP to print all are equal if all have same value or print biggest of three numbers using if else statement.
import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number a : ");
		int a = sc.nextInt();
		System.out.print("\nEnter the second number b : ");
		int b = sc.nextInt();
		System.out.print("\nEnter the third number c : ");
		int c = sc.nextInt();
		sc.close();
		if (a == b && b == c) {
			System.out.println("\nAll are equal.");
		} else if (a >= b && a >= c) {
			System.out.println(a + " is the biggest number.");
		} else if (b >= c) {
			System.out.println(b + " is the biggest number.");
		} else {
			System.out.println(c + " is the biggest number.");
		}
	}

}
