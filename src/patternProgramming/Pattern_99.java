package patternProgramming;

// Ninety-ninth Pattern Problem 
import java.util.Scanner;
public class Pattern_99 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.printf("%-4d", start++);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern :
//1   2   3   4   5   
//  6   7   8   9   
//    10  11  12  
//      13  14  
//        15  