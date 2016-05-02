package code;

import java.util.Arrays;

public class Sort012Array {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 2, 1, 0, 1, 2, 0 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(sort012Array(arr)));

	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	// The algorithm below first counts the 0s & 1s and uses these counts to
	// create the sorted array with elements from set {0,1,2}. Since there will
	// be single loop with running time n, it is of O(n).

	private static int[] sort012Array(int[] arr) {

		int count0 = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count0++;
			else if (arr[i] == 1)
				count1++;
		}

		for (int i = 0; i < count0; i++)
			arr[i] = 0;
		for (int j = count0; j < count0 + count1; j++)
			arr[j] = 1;
		for (int k = count0 + count1; k < arr.length; k++)
			arr[k] = 2;

		return arr;
	}

}
