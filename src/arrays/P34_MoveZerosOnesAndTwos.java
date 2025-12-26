package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P34_MoveZerosOnesAndTwos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Updated Array : " + Arrays.toString(dutchNationalFlagAlgorithm(arr)));
		sc.close();
	}

	public static int[] dutchNationalFlagAlgorithm(int[] arr) {
		int n = arr.length;
		int mid = 0;
		int low = 0;
		int high = n - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				mid++;
				low++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
