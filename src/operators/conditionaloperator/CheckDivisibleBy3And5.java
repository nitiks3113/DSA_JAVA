package operators.conditionaloperator;

// WAJP to check and print the given number is divisible by both 3 and 5 or only by 3, only by 5 or None.
import java.util.Scanner;

public class CheckDivisibleBy3And5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check : ");
		int num = sc.nextInt();
		sc.close();
		String result = (num % 3 == 0 && num % 5 == 0) ? "Divisible by both 3 & 5"
				: ((num % 3 == 0) ? "Divisible by 3 Only" : ((num % 5 == 0) ? "Divisible by 5 only" : "None"));
		System.out.println(result);
	}

}
