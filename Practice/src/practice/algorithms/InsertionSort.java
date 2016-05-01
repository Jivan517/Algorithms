package practice.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 1, 3, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(insertionSort(arr)));
	}
	
	/*
	 * Proof that Loop Invariant holds. I(0) holds since arr[0] is just a single
	 * element (so it is automatically sorted). Assume I(i) is true. As the i+1
	 * inner loop runs, arr[i+1] is compared with each value x in arr[i],
	 * arr[i-1]... until an x is found for which arr[i+1]6< x. arr[i+1] is then
	 * placed to the right of x. This means arr[i+1] has a value between x and
	 * the next larger value. It follows that arr[0]..arr[i], arr[i+1] are now
	 * arranged in sorted order.
	 */
	/**
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] insertionSort(int[] arr){
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			
			int j = i;
			
			while(j > 0 && temp < arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = temp;
		}
		
		return arr;
	}

}
