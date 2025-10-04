package patternProgramming;

import java.util.Scanner;
public class Pattern_245 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = n * n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%-4d", num);
				if (j % 2 == 1)
					num = num - (2 * (n - i) + 1);
				else
					num = num - (2 * i - 1);
			}
			System.out.println();
			num = n * n - i;
		}
	}
}

// Here is the Pattern : 

/*
25  16  15  6   5   
24  17  14  7   4   
23  18  13  8   3   
22  19  12  9   2   
21  20  11  10  1
*/