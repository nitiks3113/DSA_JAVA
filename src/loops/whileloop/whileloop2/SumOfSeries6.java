package loops.whileloop.whileloop2;

// WAJP to print the sum of the given series : " 1/1 + 1/3 + 1/5 + ...upto 100. "
public class SumOfSeries6 {

	public static void main(String[] args) {

		int i = 1;
		double sum = 0.0;
		while (i <= 100) {
			sum += 1.0 / i;
			i += 2;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
