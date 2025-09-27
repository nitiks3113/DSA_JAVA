package patternProgramming;

import java.util.Scanner;
public class Pattern_120 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char start = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-4c", start);
			}
			start++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//A   A   A   A   A   A   A   A   A   
//	B   B   B   B   B   B   B   
//    	C   C   C   C   C   
//        	D   D   D   
//            	E 