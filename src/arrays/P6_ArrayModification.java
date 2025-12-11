package arrays;

import java.util.*;

public class P6_ArrayModification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 5, 4, 3, 6 };
		System.out.println("Resultant Array is : ");
		System.out.println(Arrays.toString(resultArr(arr)));
	}

	public static int sumOfElements(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	public static int[] resultArr(int[] arr) {
		int[] res = new int[arr.length];

		int sum = sumOfElements(arr);

		for (int i = 0; i < res.length; i++) {
			res[i] = sum - arr[i];
		}

		return res;
	}
}
