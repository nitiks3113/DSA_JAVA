package patternProgramming;

// Eighty-sixth Pattern Problem 
import java.util.Scanner;
public class Pattern_86 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = n * n;
		char ch = (char) (64 + num);
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%-4c", ch--);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				Y   
//			X   W   V   
//		U   T   S   R   Q   
//	P   O   N   M   L   K   J   
//I   H   G   F   E   D   C   B   A 