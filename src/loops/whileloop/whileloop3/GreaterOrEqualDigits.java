package loops.whileloop.whileloop3;

// WAJP to take user input and print all the digits of the number which are greater or equal to 5.
import java.util.Scanner;

public class GreaterOrEqualDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp == 5 || temp > 5) {
				System.out.println(temp);
			}
			num /= 10;
		}
		sc.close();
	}

}
