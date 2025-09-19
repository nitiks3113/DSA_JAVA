package loops.whileloop.whileloop2;

// WAJP to print the sum of the given series : "1/(1*1*1) + 1/(2*2*2) + 1/(3*3*3) + ...upto 100."
public class SumOfSeries8 {

	public static void main(String[] args) {

		int i = 1;
		double sum = 0.0;
		while (i <= 100) {
			sum += 1.0 / (i * i * i);
			i++;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
