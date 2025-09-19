package loops.whileloop.whileloop3;

// WAJP to take user input and print the sum of each digit of the number.
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			sum += temp;
			num /= 10;
		}
		System.out.println("The sum of the digits is : " + sum);
		sc.close();
	}

}
