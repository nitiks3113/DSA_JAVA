package patternProgramming;

import java.util.Scanner;
public class Pattern_161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int mid = n / 2 + 1;
		int space = n / 2;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			int star = num;
			// Print Pattern
			for (int j = 1; j <= space; j++) {
				System.out.print("    ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				if (j < (start / 2) + 1)
					System.out.printf("%-4d", star--);
				else
					System.out.printf("%-4d", star++);
			}

			System.out.println();
			if (i < mid) {
				num++;
				start += 2;
				space--;
			} else {
				num--;
				start -= 2;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
            1   
        2   1   2   
    3   2   1   2   3   
4   3   2   1   2   3   4   
    3   2   1   2   3   
        2   1   2   
            1 
*/