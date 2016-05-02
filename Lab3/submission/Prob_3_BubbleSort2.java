package code;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 4, 2, 1, 3, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(optimizedBubbleSort(arr)));
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	//EXPLANATION:
	// In bubble sort, we can take advantage of the fact that in every pass (i =
	// 1, 2, 3, ..., n) the last element will be in its final sorted
	// position. So the algorithm below will help to skip over a lot of the
	// elements, resulting
	// in about a worst case 50% improvement in comparison count (though no
	// improvement in swap counts), and adds very little complexity because
	// in every pass, the n will be reduced by 1

	public static int[] optimizedBubbleSort(int[] arr) {
		int countI = 0;
		int countJ = 0;
		int n = arr.length;
		for (int i = arr.length; i >= 0; i--) {
			int newn = 0;
			// System.out.println("First Loop");
			countI++;
			for (int j = 1; j < n - 1; j++) {
				// System.out.println("Second Loop");
				countJ++;
				if (arr[j - 1] > arr[j]) {
					arr = swap(arr, j, j - 1);
					newn = i;
				}
			}

			n = newn;
		}
		System.out.println("I: " + countI + " and J:" + countJ);
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}

}
