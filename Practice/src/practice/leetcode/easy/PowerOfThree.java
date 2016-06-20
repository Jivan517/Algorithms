package practice.leetcode.easy;

/*Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?*/
public class PowerOfThree {

	public static void main(String[] args) {
		
		System.out.println("Is Power of Three - 45? " + isPowerOfThree(45));
		System.out.println("Is Power of Three - 27? " + isPowerOfThree(27));

	}
	
	public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
   }

}
