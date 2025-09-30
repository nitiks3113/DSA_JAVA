package patternProgramming;

import java.util.Scanner;
public class Pattern_173 {

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
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("    ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-4c", ch);
			}

			ch++;
			System.out.println();
			if (i < mid) {
				start += 2;
				space--;
			} else {
				start -= 2;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
            A   
        B   B   B   
    C   C   C   C   C   
D   D   D   D   D   D   D   
    E   E   E   E   E   
        F   F   F   
            G
*/