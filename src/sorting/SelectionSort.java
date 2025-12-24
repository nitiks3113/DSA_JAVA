package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Selection Sort
 */
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Sorted Array : " + Arrays.toString(selectionSort(arr)));
		sc.close();
	}

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j;
			}

			if (min != i) {
				swap(arr, i, min);
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


//Time Complexity: O(n^2)
//Space Complexity: O(1)

