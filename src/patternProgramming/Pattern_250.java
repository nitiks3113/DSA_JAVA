package patternProgramming;

import java.util.Scanner;
public class Pattern_250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n * (n + 1) / 2;

		for (int i = 1; i <= n; i++) {
			int num = start;

			for (int j = 1; j <= i; j++) {
				System.out.print(num);

				if (j < i) {
					System.out.print("\t");
				}

				num = num - (n - j);
			}

			System.out.println();
			start--;
		}

	}
}

// Here is the Pattern : 

/*
28
27	21
26	20	15
25	19	14	10
24	18	13	9	6
23	17	12	8	5	3
22	16	11	7	4	2	1
*/