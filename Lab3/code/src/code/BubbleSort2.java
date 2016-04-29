package code;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {

		int[] arr = new int[] {4, 2, 1, 3, 5};
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(optimizedBubbleSort(arr)));
	}

	public static int[] optimizedBubbleSort(int[] arr) {
		int countI = 0;
		int countJ = 0;
		int n = arr.length;
		for (int i = arr.length; i >= 0; i--) {
			int newn = 0;
			//System.out.println("First Loop");
			countI ++;
			for (int j = 1; j < n - 1; j++) {
				//System.out.println("Second Loop");
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
