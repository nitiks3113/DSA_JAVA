package loops.whileloop.whileloop2;

// WAJP to print sum of all odd numbers from 1 to 100
public class OddSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("The Sum of all odd numbers from 1 to 100 is : " + sum);
	}

}
