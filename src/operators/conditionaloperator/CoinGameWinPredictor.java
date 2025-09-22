package operators.conditionaloperator;

// Statement: There are n coins. Each turn you can take 1 or 2 coins. What is the logic that the first person will win?
import java.util.Scanner;

public class CoinGameWinPredictor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of coins : ");
		int n = sc.nextInt();
		String result = (n % 3 != 0) ? "Winner" : "Loser";
		System.out.println(result);
		sc.close();
	}

}
