package com.Kirti.corejava.conditional;

import java.util.Scanner;

public class PrintNumbersDivBy3InRange {
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lower bound:");
	int lb=sc.nextInt();
	System.out.println("Enter the value of ub:");
	int ub=sc.nextInt();
	for(int i=lb;i<=ub;i++) {
		if(i % 3==0) {
		System.out.println(i);
	}}
	sc.close();
	
	}
	}

