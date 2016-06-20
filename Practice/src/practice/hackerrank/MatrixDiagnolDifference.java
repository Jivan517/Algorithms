package practice.hackerrank;

import java.util.Scanner;

public class MatrixDiagnolDifference {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int len;
		len = in.nextInt();
		
		int[][] arr = new int[len][len];
		for(int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++){
				arr[i][j] = Integer.parseInt(in.next());
			}
		}
		
		
		System.out.println(getSum(arr));

		in.close();
	}

	private static int getSum(int[][] arrVal) {

		int sum1 = 0;
		int sum2 = 0;
		int len = arrVal.length - 1;
		for (int i = 0; i < arrVal.length; i++){
			sum1 += arrVal[i][i];
			sum2 += arrVal[i][len - i];
		}
			
		return Math.abs(sum1 - sum2);
	}
}
