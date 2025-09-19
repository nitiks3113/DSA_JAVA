package loops.whileloop.whileloop1;

// WAJP to print all the factors of a number (number itself excluded)
public class FactorsOfANumber {

	public static void main(String[] args) {

		int i = 28;
		int numbers = 1;
		while (numbers <= i / 2) {
			if (28 % numbers == 0) {
				System.out.println(numbers);
			}
			numbers++;
		}
	}

}
