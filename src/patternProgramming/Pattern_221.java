package patternProgramming;

import java.util.Scanner;
public class Pattern_221 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 3;
		int gap = 2;
		for (int i = 1; i <= n; i++) {
			System.out.print(start + "  ");
			start = start + gap;
			gap *= 2;
		}
	}
}

// Here is the Pattern :

// 3 5 9 17 33 65 129