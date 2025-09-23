package patternProgramming;

// Twenty-first Pattern Problem 
import java.util.Scanner;
public class Pattern_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
			}
			num--;
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 7
// 7
// 6 6
// 5 5 5
// 4 4 4 4
// 3 3 3 3 3
// 2 2 2 2 2 2
// 1 1 1 1 1 1 1