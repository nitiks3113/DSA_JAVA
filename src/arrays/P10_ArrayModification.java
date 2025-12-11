package arrays;

import java.util.*;

public class P10_ArrayModification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 5, 4, 3, 6 };

		System.out.println("Resultant Array is : ");
		System.out.println(Arrays.toString(resultArr(arr)));
	}

	public static int sumOfElements(int[] arr) {
		int n = arr.length;
		int mul = 1;
		for (int i = 0; i < n; i++) {
			mul = mul * arr[i];
		}

		return mul;
	}

	public static int[] resultArr(int[] arr) {
		int[] res = new int[arr.length];

		int mul = sumOfElements(arr);

		for (int i = 0; i < res.length; i++) {
			res[i] = mul / arr[i];
		}

		return res;
	}
}
