package operators.conditionaloperator;

// Print if a year is a leap year or NOT using only conditional operator.
import java.util.Scanner;

public class PrintLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year to check : ");
		int year = sc.nextInt();
		String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "Leap Year" : "Not Leap Year";
		System.out.println(result);
		sc.close();
	}

}
