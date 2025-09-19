package loops.whileloop.whileloop2;

// WAJP to print the sum of cube of all odd numbers from 1 to 100
public class OddCubeSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += (i * i * i);
			}
			i++;
		}
		System.out.println("The Sum of Cube of all the Odd numbers from 1 to 100 is : " + sum);
	}

}
