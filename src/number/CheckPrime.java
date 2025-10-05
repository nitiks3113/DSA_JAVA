package number;

// WAJP to take user input and print whether the number is Prime number or not.
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check for Prime : ");
		int n = sc.nextInt();
		sc.close();
		checkPrime(n);
	}

	public static void checkPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(n + " is a Prime Number.");
		else
			System.out.println(n + " is not a Prime Number.");
	}
}
