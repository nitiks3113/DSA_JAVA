package loops.whileloop.whileloop2;

// WAJP to print the sum of this series : 1 ∗ 2 + 2 ∗ 3 + 3 ∗ 4 ... ... upto 100
public class SumOfSeries {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += (i * (i + 1));
			i++;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
