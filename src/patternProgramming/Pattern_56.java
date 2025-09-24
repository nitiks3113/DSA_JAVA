package patternProgramming;

// Fifty-sixth Pattern Problem 
import java.util.Scanner;
public class Pattern_56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int start = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.printf("%-8d", start++);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				1       
//			2       3       
//		4       5       6       
//	7       8       9       10      
//11      12      13      14      15 