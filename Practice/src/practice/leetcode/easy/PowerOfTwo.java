package practice.leetcode.easy;

/*Given an integer, write a function to determine if it is a power of two.*/
public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("Is Power of Two - 45? " + isPowerOfTwo(45));
		System.out.println("Is Power of Two - 32? " + isPowerOfTwo(32));

	}
	
	public static boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while (n % 2 == 0) {
             n /= 2;
    }
         return n == 1;
    }

}
