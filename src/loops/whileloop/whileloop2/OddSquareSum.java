package loops.whileloop.whileloop2;

// WAJP to print the square of all odd numbers from 1 to 100
public class OddSquareSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += (i * i);
			}
			i++;
		}
		System.out.println("The Sum of Squares of all Odd numbers from 1 to 100 is : " + sum);
	}

}
