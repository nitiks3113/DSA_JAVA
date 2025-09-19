package loops.whileloop.whileloop2;

// WAJP to print the sum of all the factors of a number (number itself exluded).
import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= number / 2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("The Sum of factors of the: " + number + " is : " + sum);
		sc.close();
	}

}
