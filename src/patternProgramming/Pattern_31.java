package patternProgramming;

// Thirty-first Pattern Problem
import java.util.Scanner;
public class Pattern_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch = (char) ('A' + (n - 1));
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			ch--;
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 5
// E
// D D
// C C C
// B B B B
// A A A A A