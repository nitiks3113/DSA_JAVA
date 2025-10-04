package patternProgramming;

import java.util.Scanner;
public class Pattern_244 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {

		for (int i = 1; i <= n; i++) {
			int num = i;
			for (int j = 1; j <= n; j++) {
				System.out.printf("%-4d", num);
				if (j % 2 == 1)
					num = num + 2 * (n - i) + 1;
				else
					num = num + 2 * i - 1;
			}
			System.out.println();
		}

	}
}

// Here is the Pattern : 

/*
1   10  11  20  21  
2   9   12  19  22  
3   8   13  18  23  
4   7   14  17  24  
5   6   15  16  25 
*/