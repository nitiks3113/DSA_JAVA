package loops.whileloop.whileloop1;

// WAJP to print nth term of a fibonacci series.
public class NthTermFibonacci {

	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber = 1;
		int nthTerm = 7;
		int count = 3;
		while (count <= nthTerm) {
			int next = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = next;
			count++;
		}
		System.out.println("7th term of the fibonacci Series is : " + secondNumber);
	}

}
