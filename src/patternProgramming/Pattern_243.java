package patternProgramming;

import java.util.Scanner;
public class Pattern_243 {

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
				if (i % 2 == 1)
					System.out.printf("%-4d", num--);
				else
					System.out.printf("%-4d", num++);
			}
			System.out.println();
			if (i % 2 == 1)
				num = num - n + 1;
			else
				num = num - n - 1;
		}
	}
}

// Here is the Pattern : 

/*
25  24  23  22  21  
16  17  18  19  20  
15  14  13  12  11  
6   7   8   9   10  
5   4   3   2   1
*/