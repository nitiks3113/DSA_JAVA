package patternProgramming;

// Twenty-fifth Pattern Problem: 
import java.util.Scanner;
public class Pattern_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			int num = (n * (n + 1) / 2) - (i * (i + 1) / 2 - 1);
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-3d ", num++);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern: 
//Enter the no. of rows : 5
//15  
//13  14  
//10  11  12  
//6   7   8   9   
//1   2   3   4   5   
