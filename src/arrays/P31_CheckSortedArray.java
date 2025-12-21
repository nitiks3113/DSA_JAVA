package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P31_CheckSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is : " + Arrays.toString(arr));
		if (checkSortedArray(arr)) {
			System.out.println("Array is Sorted..");
		} else {
			System.out.println("Array is not Sorted...");
		}
		sc.close();
	}

	public static boolean checkSortedArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
