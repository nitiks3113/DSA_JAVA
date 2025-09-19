package loops.whileloop.whileloop3;

import java.util.Scanner;

public class CountBinaryBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int p = 1;
		int temp;
		int binary = 0;
		int count = 0;
		while (num > 0) {
			temp = num % 2;
			binary = binary + temp * p;
			p *= 10;
			num /= 2;
		}
		while (binary > 0) {
			temp = binary % 10;
			count++;
			binary /= 10;
		}
		System.out.println("No. of binary digits is : " + count);
		sc.close();
	}

}
