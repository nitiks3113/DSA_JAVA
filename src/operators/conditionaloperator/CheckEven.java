package operators.conditionaloperator;

// WAJP to check and print the given number is an even number or not.
import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is Even.");
		} else {
			System.out.println(num + " is Odd.");
		}
		sc.close();
	}

}
