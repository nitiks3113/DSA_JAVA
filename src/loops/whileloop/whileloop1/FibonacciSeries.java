package loops.whileloop.whileloop1;

// WAJP to print all the terms of Fibonacci Series upto n.
public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 7;
		int firstNumber = 0;
		int secondNumber = 1;
		int next;
		int i = 1;
		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");
		while (i <= n) {
			next = firstNumber + secondNumber;
			System.out.print(next + " ");
			firstNumber = secondNumber;
			secondNumber = next;
			i++;
		}
	}

}
