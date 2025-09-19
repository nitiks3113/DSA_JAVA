package loops.whileloop.whileloop1;

// WAJP to print a number is prime or not
public class CheckPrime {

	public static void main(String[] args) {

		int number = 28;
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				System.out.println("Not Prime : " + number);
				return;
			}
			i++;
		}
		System.out.println("Prime : " + number);
	}

}
