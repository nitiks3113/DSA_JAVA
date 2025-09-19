package loops.whileloop.whileloop2;

// WAJP to print sum of all natural numbers from 1 to 100
public class SumNaturalNo1To100 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("The Sum of all natural number from 1 to 100 is : " + sum);
	}

}
