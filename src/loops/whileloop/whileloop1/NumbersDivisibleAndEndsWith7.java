package loops.whileloop.whileloop1;

// WAJP to print and count all the numbers from 1 to 1000 which are divisible by 7 and also ends with 7.
public class NumbersDivisibleAndEndsWith7 {

	public static void main(String[] args) {

		int number = 1;
		int count = 0;
		while (number <= 1000) {
			if (number % 7 == 0 && number % 10 == 7) {
				System.out.println(number);
				count++;
			}
			number++;
		}
		System.out.println("Total number divisible by 7 also ends with 7 are : " + count);
	}

}
