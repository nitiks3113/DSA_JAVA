package loops.whileloop.whileloop3;

// WAJP to take user input and print the biggest digit of that number.
import java.util.Scanner;

public class BiggestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int bigNum = 0;
		while (num > 0) {
			temp = num % 10;
			if (temp >= bigNum) {
				bigNum = temp;
			}
			num /= 10;
		}
		System.out.println("The Biggest digit of the given number is : " + bigNum);
		sc.close();
	}

}
