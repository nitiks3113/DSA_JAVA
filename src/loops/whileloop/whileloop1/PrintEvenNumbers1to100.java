package loops.whileloop.whileloop1;

//WAJP to print all the even numbers from 1 to 100.
public class PrintEvenNumbers1to100 {

	public static void main(String[] args) {

		int number = 1;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}
	}

}
