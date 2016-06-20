package practice.hackerrank.maycodesprint;

import java.util.Scanner;

public class PalindromicCheque {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String number = in.next();

		if (n == k) {
			String finalNumber = "";
			for (int i = 0; i < n; i++) {
				finalNumber += "9";
			}
			System.out.println(finalNumber);
			return;
		}

		for (int i = 9; i >= 0; i--) {
			
			char val = Integer.toString(i).charAt(0);
			String pal = checkNumber(number, n, k, val);
			
			if (isPalindrome(pal)) {
				System.out.println(pal);
				return;
			}
		}

		System.out.println(-1);

	}

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static String checkNumber(String number, int n, int k, char val) {

		int changeCount = 0;
		for (int i = 0; i < n / 2 && changeCount < k; i++) {
			if (number.charAt(i) != number.charAt(n - i - 1)) {
				
				System.out.println("val: " + val + " " + (number.charAt(i) != val)) ;
				
				if (number.charAt(i) != val) {
					number = number.substring(0, i) + val + number.substring(i + 1, n);
					changeCount++;
				}

				if (changeCount < k && number.charAt(n - i - 1) != val) {
					if (i >= 1)
						number = number.substring(0, n - i - 1) + val + number.substring(n - i + 1, n);
					else
						number = number.substring(0, n - i - 1) + val;

					changeCount++;
				}

			}
		}

		return number;
	}

}
