package patternProgramming;

import java.util.Scanner;
public class Pattern_207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int end = n;
		int mid = n / 2 + 1;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= start || j >= end)
					System.out.printf("%-4d", num++);
				else
					System.out.print("    ");
			}

			System.out.println();
			if (i < mid) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
		}
	}
}

// Here is the Pattern : 

/*
1                       2   
3   4               5   6   
7   8   9       10  11  12  
13  14  15  16  17  18  19  
20  21  22      23  24  25  
26  27              28  29  
30                      31 
*/