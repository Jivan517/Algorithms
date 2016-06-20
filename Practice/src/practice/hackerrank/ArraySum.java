package practice.hackerrank;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int len;
		len = in.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(in.next());
		}

		System.out.println(getSum(arr));

		in.close();
	}

	private static int getSum(int[] arrVal) {

		int sum = 0;
		for (int i = 0; i < arrVal.length; i++)
			sum += arrVal[i];
		return sum;
	}
}
