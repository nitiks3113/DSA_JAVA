package patternProgramming;

// Second Pattern Problem
import java.util.Scanner;

public class Pattern_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		if (n <= 0) {
			System.out.println("Please enter a positive number!");
			return;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
// Here is the pattern : 
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
