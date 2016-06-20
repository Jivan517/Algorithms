package practice.leetcode.easy;

import java.util.Arrays;

/*Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
*/
public class RemoveElement {

	public static int removeElement(int[] nums, int val) {

		int count = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == val) {
				count++;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] != val) {
						int temp = nums[j - 1];
						nums[j - 1] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}

		return nums.length - count;
	}

	public static void main(String[] args) {

		int[] arr = new int[] {5, 0, 8, 0,78};
		System.out.println(Arrays.toString(arr));
		System.out.println(removeElement(arr, 8));
	}

}
