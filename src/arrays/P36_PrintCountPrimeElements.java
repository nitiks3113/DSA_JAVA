package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P36_PrintCountPrimeElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array : " + Arrays.toString(arr));

		int count = 0;
		for (int i = 0; i < n; i++) {
			int ele = arr[i];
			if (checkPrime(ele)) {
				System.out.println(arr[i] + " is Prime.");
				count++;
			}
		}

		System.out.println("Total Prime numbers are : " + count);
		sc.close();
	}

	public static boolean checkPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
