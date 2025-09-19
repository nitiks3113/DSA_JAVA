package loops.whileloop.whileloop2;

// WAJP to print the sum of the given series : (1*1) * 2 + (2*2) * 3 + ... upto 100.
public class SumOfSeries3 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += ((i * i) * (i + 1));
			i++;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
