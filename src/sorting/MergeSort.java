package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements to sort : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int lb = 0;
		int ub = n - 1;
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Sorted Array : " + Arrays.toString(mergeSort(arr, lb, ub)));
		sc.close();
	}

	public static int[] mergeSort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int mid = lb + (ub - lb) / 2;
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid + 1, ub);
			merge(arr, lb, mid, ub);
		}
		return arr;
	}

	public static void merge(int[] arr, int lb, int mid, int ub) {
		int i = lb;
		int j = mid + 1;
		int k = 0;
		int[] sortArr = new int[ub - lb + 1];
		while (i <= mid && j <= ub) {
			if (arr[i] <= arr[j]) {
				sortArr[k] = arr[i];
				i++;
			} else {
				sortArr[k] = arr[j];
				j++;
			}
			k++;
		}

		if (i > mid) {
			while (j <= ub) {
				sortArr[k] = arr[j];
				j++;
				k++;
			}
		} else if (j > ub) {
			while (i <= mid) {
				sortArr[k] = arr[i];
				i++;
				k++;
			}
		}
		for (int a = 0; a < sortArr.length; a++) {
			arr[lb + a] = sortArr[a];
		}
	}
}
