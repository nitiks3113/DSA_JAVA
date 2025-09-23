package patternProgramming;

// Thirty-second Pattern Problem 
import java.util.Scanner;
public class Pattern_32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			char ch = (char) ('A' + i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 5
// A
// B A
// C B A
// D C B A
// E D C B A