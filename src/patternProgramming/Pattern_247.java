package patternProgramming;

import java.util.Scanner;
public class Pattern_247 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = n * (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1)
					System.out.printf("%-4d", num--);
				else
					System.out.printf("%-4d", num++);
			}

			System.out.println();
			if (i % 2 == 1)
				num = num - i;
			else
				num = num - i - 1;
		}
	}
}

// Here is the Pattern : 


/*

28  
26  27  
25  24  23  
19  20  21  22  
18  17  16  15  14  
8   9   10  11  12  13  
7   6   5   4   3   2   1  
*/