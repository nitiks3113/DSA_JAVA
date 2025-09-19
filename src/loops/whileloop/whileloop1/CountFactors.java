package loops.whileloop.whileloop1;

// WAJP to count factors of a number (number itself excluded)
public class CountFactors {

	public static void main(String[] args) {

		int number = 28;
		int i = 1;
		int count = 0;
		while (i <= number / 2) {
			if (number % i == 0) {
				count++;
			}
			i++;
		}
		System.out.println("Total Factors of 28 is : " + count);
	}

}
