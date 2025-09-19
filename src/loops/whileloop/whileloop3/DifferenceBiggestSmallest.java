package loops.whileloop.whileloop3;

// WAJP to take user input and print the difference between biggest and smallest digit.
import java.util.Scanner;

public class DifferenceBiggestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int bigNum = 0;
		int smallNum = Integer.MAX_VALUE;
		while (num > 0) {
			temp = num % 10;
			if (temp >= bigNum) {
				bigNum = temp;
			}
			if (temp <= smallNum) {
				smallNum = temp;
			}
			num /= 10;
		}
		int difference = bigNum - smallNum;
		System.out.println("The Difference between biggest digit & smalles digit is : " + difference);
		sc.close();
	}

}
