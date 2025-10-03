package patternProgramming;

import java.util.Scanner;
public class Pattern_224 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(firstTerm + "   ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}

// Fibonacci Series

// 0   1   1   2   3   5   8   13   21