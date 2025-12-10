package arrays;

import java.util.*;

public class Program10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(resultArr(arr)));
		sc.close();
	}

	public static int[] resultArr(int[] arr) {
		int sum = getMultiply(arr);
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = sum / arr[i];
		}
		return res;
	}

	public static int getMultiply(int[] arr) {
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			mul = mul * arr[i];
		}
		return mul;
	}
}
