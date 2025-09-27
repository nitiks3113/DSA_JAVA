package patternProgramming;

import java.util.Scanner;
public class Pattern_128 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		// Upper Part
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Lower Part
		int end = n / 2;
		for (int i = n / 2 + 2; i <= n; i++) {
			for (int j = 1; j <= end; j++) {
				System.out.print("* ");
			}
			end--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

// This is only valid for odd number of rows also when n > 1.