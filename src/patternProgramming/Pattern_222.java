package patternProgramming;

import java.util.Scanner;
public class Pattern_222 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			int nextNum = num * num + 1;
			System.out.print(nextNum + "   ");
			num = nextNum;
		}
	}
}

// Here is the Pattern : 

// 1   2   5   26   677