package practice.hackerrank;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int len;
		len = in.nextInt();
		long[] arr = new long[len];
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(in.next());
		}

		System.out.println(getSum(arr));

		in.close();
	}

	private static long getSum(long[] arrVal) {

		int sum = 0;
		for (int i = 0; i < arrVal.length; i++)
			sum += arrVal[i];
		return sum;
	}
}
