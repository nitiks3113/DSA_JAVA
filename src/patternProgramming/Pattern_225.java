package patternProgramming;

import java.util.Scanner;
public class Pattern_225 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		// Tribonacci Series
		int firstTerm = 0;
		int secondTerm = 0;
		int thirdTerm = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(firstTerm + "   ");
			int nextTerm = firstTerm + secondTerm + thirdTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			thirdTerm = nextTerm;
		}
	}
}

// Here is the Series : 

// 0   0   1   1   2   4   7   13   24  