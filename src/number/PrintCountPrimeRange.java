package number;

// WAJP to print and count all the Prime numbers up to a given range.
import java.util.Scanner;
public class PrintCountPrimeRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		sc.close();
		int count = 0;
		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				boolean check = checkPrime(i);
				if (check) {
					count++;
					System.out.println("Prime : " + i);
				}
			}
			System.out.println("Total Count of Prime numbers between " + num1
					+ " and " + num2 + " is : " + count);
		} else {
			for (int i = num2; i <= num1; i++) {
				boolean check = checkPrime(i);
				if (check) {
					count++;
					System.out.println("Prime : " + i);
				}
			}
			System.out.println("Total Count of Prime numbers between " + num1
					+ " and " + num2 + " is : " + count);
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

// Normalize range (remove duplication)
// int start = Math.min(num1, num2);
// int end = Math.max(num1, num2);