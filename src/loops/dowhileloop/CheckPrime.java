package loops.dowhileloop;

// WAJP to check a number is a prime number or not and ask user in end to press Y/y to continue or any other key to exit.
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;
		System.out.println("==========Program Starts==============");
		do {
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			boolean res = isPrime(num);
			if (res) {
				System.out.println(num + " is Prime.");
			} else {
				System.out.println(num + " is not Prime.");
			}
			System.out.print("Do you want to continue? (Y/n): ");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		System.out.println("============Program Ends============");
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}

// Focus on Input Validation
