package loops.whileloop.whileloop3;

// Write a java program to take a user input and reverse the number.
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int revNum = 0;
		int originalNum = num;
		int temp;
		while (num > 0) {
			temp = num % 10;
			revNum = revNum * 10 + temp;
			num /= 10;
		}
		System.out.println("The Revese of the number : " + originalNum + " is : " + revNum);
		sc.close();
	}

}
