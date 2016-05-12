package mum.edu.lab10;

public class KnapsackProblem {

	public static void main(String[] args) {
		
		KnapsackProblem kp = new KnapsackProblem();
		int[] w = new int[] {0, 5, 4, 6, 3};
		int[] v = new int[] {0, 10, 40, 30, 50};
		int W = 10;
		System.out.println("Max Value for weight: 10 is = " + kp.knapsackSolution(w, v, W, 4));

	}
	
	private int knapsackSolution(int[] w, int[] v, int W, int n){
		
				
		int[][] V = new int[n + 1][W + 1];
		for(int j = 0; j <= W; j++)
			V[0][j] = 0;
		int[][] keep = new int[n + 1][W + 1];
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j <= W; j++){
				if(w[i] <= j && V[i-1][j] < v[i] + V[i-1][j-w[i]]){
					V[i][j] = v[i] + V[i-1][j-w[i]];
					keep[i][j] = 1;
				}
				else{
					V[i][j] = V[i-1][j];
					keep[i][j] = 0;
				}
			}
		}
		
		int k = W;
		for(int i = n; i > 0; i--){
			if(keep[i][k] == 1){
				System.out.println("Item: i = " + i);
				k -= w[i];
			}
		}
		
		
		return V[n][W];
	}

}
