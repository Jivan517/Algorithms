package practice.hackerrank;

import java.util.Scanner;

public class KnapsackSolution {

	public static void main(String[] args) {
		

		KnapsackSolution kp = new KnapsackSolution();
		
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		
		if(testCases > 0){
			
		}
		
	}
	
	private int knapsackSolution(int[] w, int[] v, int W, int n){
		
		
		int[][] V = new int[n + 1][W + 1];
		for(int j = 0; j <= W; j++)
			V[0][j] = 0;
		//int[][] keep = new int[n + 1][W + 1];
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j <= W; j++){
				if(w[i] <= j && V[i-1][j] < v[i] + V[i-1][j-w[i]]){
					V[i][j] = v[i] + V[i-1][j-w[i]];
					//keep[i][j] = 1;
				}
				else{
					V[i][j] = V[i-1][j];
					//keep[i][j] = 0;
				}
			}
		}
		
		
		return V[n][W];
	}

}
