package loops.whileloop.whileloop3;

// WAJP to take user input and count how many times 3 appeared in the number.
import java.util.Scanner;

public class CountDigit3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp == 3) {
				count++;
			}
			num /= 10;
		}
		System.out.println("The number of 3's present in the number is : " + count);
		sc.close();

	}

}
