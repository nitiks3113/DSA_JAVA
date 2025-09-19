package loops.whileloop.whileloop3;

// Design a method which will accept a number and will return true if it has different adjacent digits.
import java.util.Scanner;

public class CheckAdjacentDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean res = CheckDigits(num);
		if (res) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

	public static boolean CheckDigits(int number) {
		int currentDigit;
		int previousDigit = -1;
		boolean re = false;

		if (number < 0) {
			number = Math.abs(number);
		}

		if (number < 10) {
			return true; // Single digit always has "different adjacent digits"
		}

		while (number > 0) {
			currentDigit = number % 10;
			if (currentDigit != previousDigit) {
				re = true;
			} else {
				return false;
			}
			previousDigit = currentDigit;
			number /= 10;
		}
		if (re) {
			return true;
		}
		return false;
	}
}
