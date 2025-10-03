package patternProgramming;

import java.util.Scanner;
public class Pattern_227 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int num = 1;
		int gap = 2;
		for (int i = 1; i <= n; i++) {
			System.out.print(num + "   ");
			num = num + gap;
			gap += 2;
		}
	}
}

// Here is the Series : 

// 1   3   7   13   21   31   43   57   73  