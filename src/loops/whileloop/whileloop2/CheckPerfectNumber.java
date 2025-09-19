package loops.whileloop.whileloop2;

// WAJP to accept a number from user and print the number is a perfect number or not.
import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= number / 2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == number) {
			System.out.println("This is Perfect Number.");
		} else {
			System.out.println("This is not a Perfect Number.");
		}
		sc.close();
	}

}
