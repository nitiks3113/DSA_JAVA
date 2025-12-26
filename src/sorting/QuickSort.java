package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int lb = 0;
		int ub = n - 1;
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Sorted Array : " + Arrays.toString(quickSort(arr, lb, ub)));
		sc.close();
	}

	public static int[] quickSort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int loc = partitionArr(arr, lb, ub);
			quickSort(arr, lb, loc - 1);
			quickSort(arr, loc + 1, ub);
		}

		return arr;
	}

	public static int partitionArr(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while (start < end) {
			while (start <= ub && arr[start] <= pivot) {
				start++;
			}

			while (end >= lb && arr[end] > pivot) {
				end--;
			}

			if (start < end) {
				swap(arr, start, end);
			}
		}

		swap(arr, lb, end);

		return end;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
