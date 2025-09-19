package loops.whileloop.whileloop3;

// WAJP to take user input and count the total digits of the number.
import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println("The total digits in the given number is : " + count);
		sc.close();
	}

}
