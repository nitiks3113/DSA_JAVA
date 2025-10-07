package number;

// WAJP to print all the alternate Prime numbers up to a given range.
import java.util.Scanner;

public class PrintAlternatePrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which print alternate primes : ");
		int n = sc.nextInt();
		System.out.print("Choose your starting position either 2 or 3 : ");
		int num = sc.nextInt();
		int choice = num % 2;
		printAlternatePrimes(n, choice);
		sc.close();

	}

	public static boolean checkPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Print Alternate Primes
	public static void printAlternatePrimes(int n, int startPosition) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (checkPrime(i)) {
				if (count % 2 == startPosition)
					System.out.println(i);
				count++;
			}
		}
	}
}
