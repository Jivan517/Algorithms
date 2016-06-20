package practice.hackerrank.maycodesprint;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] alice = new int[3];
		int[] bob = new int[3];
		
		for(int i = 0; i < alice.length; i++){
			alice[i] = Integer.parseInt(in.next());
		}
		
		for(int i = 0; i < bob.length; i++){
			bob[i] = Integer.parseInt(in.next());
		}
		
		int aliceCount = 0;
		int bobCount = 0;
		
		for(int i = 0; i < alice.length && i < bob.length; i++){
			if(alice[i] > bob[i])
				aliceCount++;
			else if(alice[i] < bob[i])
				bobCount++;
		}
		
		System.out.println(aliceCount + " " + bobCount);

	}

}
