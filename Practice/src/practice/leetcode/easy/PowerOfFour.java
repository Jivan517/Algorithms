package practice.leetcode.easy;

/*Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.
*/
		
public class PowerOfFour {
	
	public static boolean isPowerOfFour(int num) {

		if (num == 1)
			return true;
		while (num > 4 && num % 4 == 0) {
			num = num / 4;
		}

		return num == 4;
	}

	public static void main(String[] args) {

		System.out.println("Is Power of Four - 64? " + isPowerOfFour(64));
		System.out.println("Is Power of Four - 27? " + isPowerOfFour(27));
	}

}
