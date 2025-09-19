package loops.whileloop.whileloop2;

// WAJP to take two input from the user and print the power of a to b.
import java.util.Scanner;

public class PowerOfAToB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		int temp = b;
		int pow = 1;
		while (b >= 1) {
			pow *= a;
			b--;
		}
		System.out.println(a + " to power " + temp + " is : " + pow);
		sc.close();
	}

}
