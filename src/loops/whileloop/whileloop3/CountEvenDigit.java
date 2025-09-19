package loops.whileloop.whileloop3;

// WAJP to take user input and count how many times an even digit appeared in the number.
import java.util.Scanner;

public class CountEvenDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp % 2 == 0) {
				count++;
			}
			num /= 10;
		}
		System.out.println("The total even digit's is : " + count);
		sc.close();
	}

}
