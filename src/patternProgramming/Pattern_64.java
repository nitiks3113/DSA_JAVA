package patternProgramming;

// Sixty-fourth Pattern Problem 
import java.util.Scanner;
public class Pattern_64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			char start = ch;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Characters
			for (int k = 1; k <= i; k++) {
				System.out.printf("%-4c", start--);
			}
			ch++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//        A   
//      B   A   
//    C   B   A   
//  D   C   B   A   
//E   D   C   B   A 