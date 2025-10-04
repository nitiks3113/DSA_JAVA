package patternProgramming;

import java.util.Scanner;
public class Pattern_246 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1)
					System.out.printf("%-4d", num++);
				else
					System.out.printf("%-4d", num--);
			}

			System.out.println();
			if (i % 2 == 1)
				num = num + i;
			else
				num = num + i + 1;
		}
	}
}

// Here is the Pattern : 

/*
1   
3   2   
4   5   6   
10  9   8   7   
11  12  13  14  15  
21  20  19  18  17  16  
22  23  24  25  26  27  28
*/