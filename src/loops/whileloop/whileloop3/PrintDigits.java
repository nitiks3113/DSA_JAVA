package loops.whileloop.whileloop3;

// WAJP to take user input and print each digit of the number one by one from right to left.
import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		while (num > 0) {
			temp = num % 10;
			System.out.println(temp);
			num /= 10;
		}
		sc.close();

	}
}
