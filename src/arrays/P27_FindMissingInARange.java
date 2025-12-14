package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAJP find missing element from a given array which has a missing element in a
 * range of n.
 */
public class P27_FindMissingInARange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is : " + Arrays.toString(arr));
		System.out.println("The missing element is : " + findMissing(arr));
	}

	public static int findMissing(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}

		int originalSum = n * (n + 1) / 2;
		return originalSum - sum;
	}
}

// The Array must contain at least one zero 