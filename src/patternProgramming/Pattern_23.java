package patternProgramming;

// Twenty-third Pattern Problem
import java.util.Scanner;
public class Pattern_23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 5
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15