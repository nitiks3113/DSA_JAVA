package loops.whileloop.whileloop1;

// WAJP to count and print all the numbers from 1 to 100 which are divisible by 7 or ends with 7.
public class NumbersEndsWith7 {

	public static void main(String[] args) {

		int number = 1;
		int count = 7;
		while (number <= 100) {
			if (number % 7 == 0 || number % 10 == 7) {
				System.out.println(number);
				count++;
			}
			number++;
		}
		System.out.println("Total number divisible by 7 or ends with 7 are : " + count);
	}

}
