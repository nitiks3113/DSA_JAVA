package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAJP the shift all 0’s to left and all 1’s to the right(Without Sorting).
 */
public class P33_ShiftZeroesAndOnes {

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
		System.out.println("Updated Array : " + Arrays.toString(shiftZeroesAndOnes(arr)));
		sc.close();
	}

	public static int[] shiftZeroesAndOnes(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			if (arr[left] == 0) {
				left++;
			} else if (arr[right] == 1) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}
}
