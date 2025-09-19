package loops.whileloop.whileloop1;

// WAJP to print and count factors of a number (number itself excluded)
public class FactorsCountNumbers {

	public static void main(String[] args) {

		int i = 1;
		int number = 28;
		int count = 0;
		while (i <= number / 2) {
			if (number % i == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("Total Factors are : " + count);
	}

}
