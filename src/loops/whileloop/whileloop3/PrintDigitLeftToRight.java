package loops.whileloop.whileloop3;

// Write a java program to take a user input and print each digit of the number from left to right.
import java.util.Scanner;

public class PrintDigitLeftToRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int originalNum = num;
		int count = 0;
		while (num > 0) {
			temp = num % 10;
			count++;
			num /= 10;
		}
		int placevalue = 1;
		while (count > 1) {
			placevalue = placevalue * 10;
			count--;
		}
		while (placevalue > 0) {
			temp = originalNum / placevalue;
			System.out.println(temp);
			originalNum = originalNum % placevalue;
			placevalue /= 10;
		}
		sc.close();

	}

}
