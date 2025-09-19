package loops.whileloop.whileloop3;

// WAJP to take user input and count how many 0 digit in the number.
import java.util.Scanner;

public class CountDigit0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp == 0) {
				count++;
			}
			num /= 10;
		}
		System.out.println("The number of 0's present in the number is : " + count);
		sc.close();
	}

}
