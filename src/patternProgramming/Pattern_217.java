package patternProgramming;

import java.util.Scanner;
public class Pattern_217 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 0;
		int gap = 2;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Pattern
			for (int j = 1; j <= i; j++) {
				int nextNum = start + gap;
				System.out.printf("%-4d", nextNum);
				start = nextNum;
				gap += 2;
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 

/*
            2   
        6   12  
    20  30  42  
56  72  90  110 
*/