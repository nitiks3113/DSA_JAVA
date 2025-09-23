package patternProgramming;

// Twenty-fourth Pattern Problem.
import java.util.Scanner;
public class Pattern_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = i * (i + 1) / 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern:
// Enter the no. of rows : 5
// 1
// 3 2
// 6 5 4
// 10 9 8 7
// 15 14 13 12 11