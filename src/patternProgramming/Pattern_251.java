package patternProgramming;

import java.util.Scanner;
public class Pattern_251 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = n * (n + 1) / 2;
		int start;
		int a = n;
		for (int i = 1; i <= n; i++) {
			int col = n - i + 1;
			if (n % 2 == 0) {
				start = num;
			} else {
				start = num;
			}
			int star = start;
			for (int j = 1; j <= i; j++) {
				System.out.print(star + " ");
			}
			System.out.println();
			start++;
		}
	}
}
