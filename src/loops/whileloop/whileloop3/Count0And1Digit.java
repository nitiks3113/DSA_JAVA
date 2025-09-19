package loops.whileloop.whileloop3;

// WAJP to take user input and count the number of 0’s bits and 1’s bits in that number.
import java.util.Scanner;

public class Count0And1Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int count0 = 0;
		int count1 = 0;
		while (num > 0) {
			temp = num % 2;
			if (temp == 0) {
				count0++;
			} else {
				count1++;
			}
			num /= 2;
		}
		System.out.println("Number of 0's is : " + count0);
		System.out.println("Number of 1's is : " + count1);
		sc.close();
	}

}

// One small issue cannot accurate if num = 0.