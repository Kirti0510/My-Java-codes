package com.careerit.cj.demo;

import java.util.Scanner;
public class CalProfitOrLoss {

	public static void main(String[] args) {
		 float sp,bp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of sp:");
			sp=sc.nextInt();
			System.out.println("Enter value of bp:");
			bp=sc.nextInt();
			
		 float amount=sp-bp;
		 if(amount<0) {
			 System.out.println("You made loss of: (Rs)"+amount);}
		 else if(amount>0) {
			 System.out.println("You made Profit of: (Rs)"+amount);
			 }
		 else {
			 System.out.println("No Profit No Loss");
		 
		 }
		 sc.close();

	}
}
