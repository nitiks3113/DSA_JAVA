package patternProgramming;

import java.util.Scanner;
public class Pattern_215 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int start = 0;
		int gap = 2;
		for (int i = 1; i <= n; i++) {
			int nextNum = start + gap;
			System.out.print(nextNum + "  ");
			start = nextNum;
			gap += 2;
		}
	}
}

// Here is the Series : 

// 2  6  12  20  30  42 