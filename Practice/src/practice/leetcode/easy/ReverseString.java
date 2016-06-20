package practice.leetcode.easy;
/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
		*/
public class ReverseString {

	public static String reverseString(String s) {

		if (s == null || s.length() == 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; --i) {

			sb.append(s.charAt(i));

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println("Reverse of 'Jivan': " + reverseString("Jivan"));

	}

}
