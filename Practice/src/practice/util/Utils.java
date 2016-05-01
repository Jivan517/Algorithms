package practice.util;

public class Utils {
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}
}
