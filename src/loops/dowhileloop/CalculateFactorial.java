package loops.dowhileloop;

// WAJP to print factorial and ask user in end to press Y/n to continue or any other key to exit.
import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;
		System.out.println("==========Factorial Calculator============");

		do {
			System.out.print("Enter a number to calculate factorial : ");
			int n = sc.nextInt();

			if (n < 0) {
				System.out.println("Invalid Number.");
			} else if (n == 0) {
				System.out.println("Factorial of the number is : 1");
			} else {
				printFactorial(n);
			}

			System.out.print("Do you want to continue? (Y/n): ");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		System.out.println("================Program Ends================");
		sc.close();
	}

	public static void printFactorial(int n) {
		int num = n;
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		System.out.println("Factorial of the number : " + num + " is : " + fact);
	}

}
