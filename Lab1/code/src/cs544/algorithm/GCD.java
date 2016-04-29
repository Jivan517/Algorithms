package cs544.algorithm;

public class GCD {

	public static void main(String[] args) {

		
		System.out.println("GCD of 8, 12: " + gcd(-8,12));

		System.out.println("GCD of 24, 15: " + gcd(24,15));
	}
	
	private static int gcd(int m, int n){
		
		if(n == 0)
			return m;
		return gcd(n, m%n);
	}

}
