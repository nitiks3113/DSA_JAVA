package patternProgramming;

import java.util.Scanner;
public class Pattern_180 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int space = n / 2;
		int mid = n / 2 + 1;
		char ch1 = 'A';
		for (int i = 1; i <= n; i++) {
			char ch = ch1;
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("    ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				if (j < (start / 2) + 1)
					System.out.printf("%-4c", ch--);
				else
					System.out.printf("%-4c", ch++);
			}
			System.out.println();
			if (i < mid) {
				ch1++;
				start += 2;
				space--;
			} else {
				ch1--;
				start -= 2;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
            A   
        B   A   B   
    C   B   A   B   C   
D   C   B   A   B   C   D   
    C   B   A   B   C   
        B   A   B   
            A   
*/