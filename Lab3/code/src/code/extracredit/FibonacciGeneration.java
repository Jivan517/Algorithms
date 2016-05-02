package code.extracredit;

public class FibonacciGeneration {

	private static long[] fiboLookupTable = new long[100];

	public static void main(String[] args) {

		int n = 40;

		long prevTime = System.currentTimeMillis();
		long val = fibonacci(n);
		long currentTime = System.currentTimeMillis();
		System.out.println("[CLASSIC, n = " + n + "]	Total time for execution: " + (currentTime - prevTime) + " with Fibo: " + val);

		prevTime = System.currentTimeMillis();
		val = fibonacciWithMemoization(n);
		currentTime = System.currentTimeMillis();
		System.out.println("[MEMOIZATION, n = " + n + "]	Total time for execution: " + (currentTime - prevTime) + " with Fibo: " + val);

		n = 10000000;
		prevTime = System.currentTimeMillis();
		val = fibonacciIterative(n);
		currentTime = System.currentTimeMillis();
		System.out.println("[ITERATIVE, n = " + n + "]	Total time for execution: " + (currentTime - prevTime) + " with Fibo: " + val);
		
		prevTime = System.currentTimeMillis();
		val = fibonacciMatrix(n);
		currentTime = System.currentTimeMillis();
		System.out.println("[MATRIX, n = " + n + "]	Total time for execution: " + (currentTime - prevTime) + " with Fibo: " + val);

	}

	/*
	 * Time Complexity: O(2^n) 
	 */
	private static long fibonacci(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("We assume the positive fibonacci sequence only!");
		}
		if (n <= 1)
			return n;
		// System.out.println("[CLASSIC]Value of n: " + n);
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// Memoization is an optimization technique used primarily to speed up
	// computer programs by storing the results of expensive function calls and
	// returning the cached result when the same inputs occur again. Memoization
	// has also been used in other contexts (and for purposes other than speed
	// gains), such as in simple mutually recursive descent parsing in a
	// general top-down parsing algorithm that accommodates ambiguity and
	// left recursion in polynomial time and space. Here, we maintain the lookup
	// table.

	/*
	 * Time Complexity: O(n) 
	 */
	private static long fibonacciWithMemoization(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("We assume the positive fibonacci sequence only!");
		}

		if (n <= 1)
			return n;

		if (n < fiboLookupTable.length && fiboLookupTable[n] != 0)
			return fiboLookupTable[n];
		else {
			long val = fibonacciWithMemoization(n - 1) + fibonacciWithMemoization(n - 2);
			if (fiboLookupTable.length > n)
				fiboLookupTable[n] = val;
			// System.out.println("[MEMOIZATION]Value of n: " + n);
			return val;
		}

	}

	// Dynamic Programming
	/*
	 * Time Complexity: O(n) 
	 */
	private static long fibonacciIterative(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("We assume the positive fibonacci sequence only!");
		}

		if (n <= 1)
			return n;

		long a = 0;
		long fibo = 1;
		long b = 0;
		for (int i = 2; i <= n; ++i) {

			b = fibo % 1000000007;
			fibo = (fibo + a) % 1000000007;
			a = b;
		}

		return fibo;
	}

	/*
	 * Time Complexity: O(log(n)) 
	 */
	private static  long fibonacciMatrix(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("We assume the positive fibonacci sequence only!");
		}

		if (n <= 1)
			return n;

		/*         
	     * [ 1 1 ]     [ Fibo(n+1) Fibo(n)   ]
	     * [ 1 0 ]   = [ Fibo(n)   Fibo(n-1) ]
	     */
		long[][] result = { 
				{ 1, 1 }, 
				{ 1, 0 } 
			};
		
		long[][] identity = {
				{1, 0},
				{0, 1}
		};
		
		while(n > 0){
			
			if(n % 2 == 1)
				identity = multiply(identity, result);
			
			n /= 2;
			
			result = multiply(result, result);
		}
		
		
		return identity[1][0];
	}

	/*
	 * It multiplies 2 matrices X and Y of size 2x2, and returns the result
	 * 
	 */
	private static long[][] multiply(long X[][], long Y[][]) {

		long x00 = X[0][0] * Y[0][0] + X[0][1] * Y[1][0];
		long x01 = X[0][0] * Y[0][1] + X[0][1] * Y[1][1];
		long x10 = X[1][0] * Y[0][0] + X[1][1] * Y[1][0];
		long x11 = X[1][0] * Y[0][1] + X[1][1] * Y[1][1];

		long[][] result = { 
				{ x00 % 1000000007, x01 % 1000000007 },
				{ x10 % 1000000007, x11 % 1000000007 } 
				};

		return result;
	}

}
