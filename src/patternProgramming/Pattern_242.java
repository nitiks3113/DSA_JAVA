package patternProgramming;

import java.util.Scanner;
public class Pattern_242 {

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
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.printf("%-4d", num++);
				else
					System.out.printf("%-4d", num--);
			}
			System.out.println();
			if (i % 2 == 1) {
				num = num + n - 1;
			} else {
				num = num + n + 1;
			}
		}
	}
}

// Here is the Pattern : 

/*
Enter the number of rows : 5
1   2   3   4   5   
10  9   8   7   6   
11  12  13  14  15  
20  19  18  17  16  
21  22  23  24  25
*/