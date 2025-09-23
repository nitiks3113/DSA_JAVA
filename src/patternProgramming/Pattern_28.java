package patternProgramming;

// Twenty-Eighth Pattern Problem
import java.util.Scanner;
public class Pattern_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch;
		ch = (char) (65 + (n * (n + 1) / 2 - 1));
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//Enter the no. of rows : 5
//O 
//N M 
//L K J 
//I H G F 
//E D C B A 