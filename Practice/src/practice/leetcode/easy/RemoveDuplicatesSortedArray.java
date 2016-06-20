package practice.leetcode.easy;

import java.util.Arrays;

/*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
*/
public class RemoveDuplicatesSortedArray {

	public static int removeDuplicates(int[] A) {
		int length = A.length;
		if (length == 0 || length == 1)
			return length;
		int i = 1;
		for (int j = 1; j < length; j++) {
			if (A[j] != A[j - 1]) {
				A[i] = A[j];
				i++;
			}
		}
		if (i < length)
			A[i] = '\0';
		return i;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 5, 8, 8, 78 };
		System.out.println(Arrays.toString(arr));
		System.out.println(removeDuplicates(arr));
	}

}
