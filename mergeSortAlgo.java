package sorting;

import java.util.Arrays;

public class mergeSortAlgo {
	public static void main(String[] args) {
		int[] test = new int[] { 1, 5, 3, 6, 4, 7, 8 };

		System.out.println("original array=:" + Arrays.toString(test));
		System.out.println("sorted array=:" + Arrays.toString(sort(test, 0, test.length - 1)));

	}

	public static int[] sort(int[] a, int lower, int upper) {
		if (upper == lower) {
			int[] x = new int[] { a[lower] };
			return x;
		}
		int middle = (lower + upper) / 2;

		if (upper - lower > 2) {
			int[] a1 = sort(a, lower, middle);
			int[] a2 = sort(a, middle + 1, upper);
			return merge(a1, a2);
		} else {
			return insertionSort(Arrays.copyOfRange(a, lower, upper + 1));
		}

	}

	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		int m = a.length;
		int n = b.length;

		while (i < m && j < n) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < m) {
			c[k] = a[i];
			i++;
			k++;
		}

		while (j < n) {
			c[k] = b[j];
			j++;
			k++;
		}

		return c;
	}

	private static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];

			int j = i;

			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = temp;
		}

		return arr;
	}

}