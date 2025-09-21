package operators.conditionaloperator;

// Test the Rank of a student
import java.util.Scanner;

public class StudentRankTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks obtained by the Student : ");
		int marks = sc.nextInt();
		String result = (marks >= 75) ? "First Class"
				: (marks >= 60) ? "Second Class" : (marks >= 50) ? "Third Class" : (marks >= 35) ? "Pass" : "Fail";
		System.out.println(result);
		sc.close();
	}

}
