package operators.conditionaloperator;

// WAJP to check and print the given +ve number is a three digit number or not.
import java.util.Scanner;

public class CheckThreeDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (num >= 100 && num <= 999) {
			System.out.println(num + " is a Three Digit Number.");
		} else {
			System.out.println(num + " is not a Three Digit Number.");
		}
		sc.close();
	}

}
