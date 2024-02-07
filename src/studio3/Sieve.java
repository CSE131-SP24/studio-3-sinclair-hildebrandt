package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();
		boolean Prime [] = new boolean [n-1];
		for (int i=0; i <Prime.length ; i++) {
			Prime[i]=true;
		}
		
		int NumberSet [] = new int [n-1];
		for (int j=0; j<NumberSet.length; j++) {
			NumberSet[j]= j+2;
		}

		//math stuff
		for (int x = 0; x<NumberSet.length; x++) {
			if (Prime[x]==true) {
				for (int y = x+1; y<NumberSet.length; y++) {
					if(NumberSet[y]%NumberSet[x]==0) {
						Prime[y]=false;
						
					}
				}
			}
		}
		//final print
		System.out.println("Prime numbers: ");
		for (int i = 0; i<Prime.length; i++) {
			if (Prime[i]==true) {
			System.out.println(NumberSet[i]);
			}
		}
		
	}

}
