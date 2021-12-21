package com.Kirti.corejava.ForLoop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N= sc.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++) {
			System.out.print(i+" ");
			sum=sum+i;
		}
		//int sum1=(N *( N+1)/2);
		System.out.print("\nEven number:");
		for(int i=2;i<=N;i=i+2) {
			System.out.print(i+" ");
		}
			System.out.print("\nOdd number");
			for(int i=1;i<=N;i=i+2) {
				System.out.print(i+" ");
			}
		System.out.println("The sum of first:" +N+ " natural number is "+sum);
		sc.close();
		
	}
}
