package loops.whileloop.whileloop1;

// WAJP to print and count all the numbers from 1 to 100 which are divisible by 7.
public class CountNumbersDivisibleBy7 {

	public static void main(String[] args) {

		int number = 1;
		int count = 0;
		while (number <= 100) {
			if (number % 7 == 0) {
				System.out.println(number);
				count++;
			}
			number++;
		}
		System.out.println("Total numbers divisible by 7 is : " + count);
	}

}
