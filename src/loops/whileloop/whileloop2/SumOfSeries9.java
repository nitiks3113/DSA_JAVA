package loops.whileloop.whileloop2;

// WAJP to print the sum of the given series : " 1/(1*2) + 1/(2*3) + 1/(3*4) + ... upto 100."
public class SumOfSeries9 {

	public static void main(String[] args) {
		int i = 1;
		int next = i + 1;
		double sum = 0.0;
		while (i <= 100) {
			sum += 1.0 / (i * next);
			i++;
		}
		System.out.println("The Sum of the above series is : " + sum);
	}

}
