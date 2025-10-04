package patternProgramming;

import java.util.Scanner;
public class Pattern_248 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = 1;

			for (int j = 1; j <= i; j++) {
				int val;
				if (j % 2 == 1) {
					val = start + (i - j);
				} else {
					val = start + (n - i);
				}
				System.out.printf("%-4d", val);

				start += (n - j + 1);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 

/*
1   
2   13  
3   12  14  
4   11  15  22  
5   10  16  21  23  
6   9   17  20  24  27  
7   8   18  19  25  26  28
*/