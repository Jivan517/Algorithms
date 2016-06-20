package practice.leetcode.easy;

import java.util.Arrays;

/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
public class MoveZeros {

	public static int[] moveZeroes(int[] nums) {
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] != 0) {
						int temp = nums[j - 1];
						nums[j - 1] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		
		return nums;
	}

	public static void main(String[] args) {

		int[] arr = new int[] {4, 0, 8, 0,78};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(moveZeroes(arr)));
	}

}
