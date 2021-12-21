package com.Kirti.corejava.ForLoop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");

		int N = sc.nextInt();
		int count=0;
		for (int i = 1; i <= N/2; i++) {
			if(N % i==0)
				System.out.println(i+" ");
			count++;
		}
		
	if(count==2) {
		System.out.println("\n "+N+" is a Prime");
	}
		else {
			System.out.println("\n "+N+" is not a Prime");
		}
		sc.close();

	}
}
