package loops.whileloop.whileloop3;

//WAJP to take user input and print all the even digits of the number one by one .
import java.util.Scanner;

public class PrintOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		while (num > 0) {
			temp = num % 10;
			if (temp % 2 != 0) {
				System.out.println(temp);
			}
			num /= 10;
		}
		sc.close();
	}

}
