package loops.whileloop.whileloop2;

// WAJP to print sum of cubes of all natural numbers from 1 to 100
public class CubeSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += (i * i * i);
			i++;
		}
		System.out.println("The Sum of Cube of all natural numbers from 1 to 100 is : " + sum);
	}

}
