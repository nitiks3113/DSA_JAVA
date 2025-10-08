package patternProgramming;

// WAJP to print and count all prime numbers in a range where sum of digits is also prime number.
import java.util.Scanner;

public class PrintCountPrimeSumDigitsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int n2 = sc.nextInt();
		boolean isPrime = false;
		int digitSum = 0;
		int count = 0;
		sc.close();
		if (n2 < n1) {
			System.out.print("Number 2 should be greater than Number 1");
			return;
		} else {
			for (int i = n1; i <= n2; i++) {
				isPrime = checkPrime(i);
				if (isPrime) {
					digitSum = digitSum(i);
					isPrime = checkPrime(digitSum);
					if (isPrime) {
						System.out.println("Prime : " + i);
						count++;
					}
				}
			}
			System.out.println("Total Prime in the range whose digits sum is also prime is : " + count);
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

	public static int digitSum(int n) {
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			sum += temp;
			n /= 10;
		}
		return sum;
	}
}
