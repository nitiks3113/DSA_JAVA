package loops.whileloop.whileloop3;

// WAJP to take user input and print the sum of digits which are less than or equal to 5.
import java.util.Scanner;

public class SumDigitsLessEqual5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp == 5 || temp < 5) {
				sum += temp;
			}
			num /= 10;
		}
		System.out.println("The sum of the digits is : " + sum);
		sc.close();
	}

}
