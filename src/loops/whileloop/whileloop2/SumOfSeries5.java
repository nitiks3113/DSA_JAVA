package loops.whileloop.whileloop2;

// WAJP to print the sum of the given series : "1/2 + 1/4 + 1/6 + 1/8 + ...upto 100;
public class SumOfSeries5 {

	public static void main(String[] args) {

		int i = 2;
		double sum = 0.0;
		while (i <= 100) {
			sum += 1.0 / i;
			i += 2;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
