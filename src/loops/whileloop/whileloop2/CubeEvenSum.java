package loops.whileloop.whileloop2;

// WAJP to print sum of all the cubes of even numbers from 1 to 100
public class CubeEvenSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum += (i * i * i);
			}
			i++;
		}
		System.out.println("The Sum of all the Cubes of Even numbers from 1 to 100 is : " + sum);
	}

}
