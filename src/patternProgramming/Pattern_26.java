package patternProgramming;

// Twenty-sixth Pattern Problem
import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = n * (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-3d ", num--);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern :
//Enter the no. of rows : 5
//15  
//14  13  
//12  11  10  
//9   8   7   6   
//5   4   3   2   1  