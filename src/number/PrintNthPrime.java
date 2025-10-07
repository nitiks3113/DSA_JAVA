package number;

// WAJP to take user input and print nth prime number.
import java.util.Scanner;
public class PrintNthPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		printNthPrime(n);
	}

	public static void printNthPrime(int n) {
		int count = 0;
		boolean isPrime = false;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			isPrime = checkPrime(i);
			if (isPrime) {
				count++;
			}
			if (count == n) {
				System.out.println(n + "th Prime is : " + i);
				break;
			}
		}
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
}
