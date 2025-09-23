package patternProgramming;

// Twenty-Nineth Pattern Problem
import java.util.Scanner;
public class Pattern_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 5
// A
// B B
// C C C
// D D D D
// E E E E E
