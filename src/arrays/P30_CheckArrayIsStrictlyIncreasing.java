package arrays;

import java.util.Scanner;

/**
 * WAJP to check if an array is strictly increasing.
 */
public class P30_CheckArrayIsStrictlyIncreasing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemnts in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		checkIncreasingArray(arr);
	}

	public static void checkIncreasingArray(int[] arr) {
		boolean check = true;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				check = true;
			} else {
				check = false;
				System.out.println("The Array is not Strictly increasing.");
				return;
			}
		}

		System.out.println("The Array is Strictly Increasing.");
	}
}
