package loops.whileloop.whileloop3;

// WAJP to take user input and count the digits which are less than or equal to 5 .
import java.util.Scanner;

public class CountDigitLessThan5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp == 5 || temp > 5) {
				count++;
			}
			num /= 10;
		}
		System.out.println("The total digits which are greater than or equals to 5 is : " + count);
		sc.close();
	}

}
