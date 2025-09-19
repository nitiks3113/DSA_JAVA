package loops.whileloop.whileloop3;

// WAJP to take user input and convert the number into binary number.
import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int originalNum = num;
		int p = 1;
		int temp;
		int binary = 0;
		while (num > 0) {
			temp = num % 2;
			binary = binary + temp * p;
			p *= 10;
			num /= 2;
		}
		System.out.println(originalNum + " : Binary is : " + binary);
		sc.close();
	}

}
