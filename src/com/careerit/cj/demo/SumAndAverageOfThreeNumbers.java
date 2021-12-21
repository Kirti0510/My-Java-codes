package com.careerit.cj.demo;

import java.util.Scanner;
public class SumAndAverageOfThreeNumbers {
 
	public static void main(String[] args) {
		int num1,num2,num3;
	/*	 num1=10;
	   num2=20;
	 num3=13;
	*/	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of num1:");
		num1=sc.nextInt();
		System.out.println("Enter value of num2:");
		num2=sc.nextInt();
		System.out.println("Enter value of num3:");
		num3=sc.nextInt();
		
		
		 int sum=num1+num2+num3;
		 int count=3;
		 float avg= sum/(float)count;
		 System.out.printf("The sum of %d ,%d ,%d is %d",num1,num2,num3,sum);
		 System.out.printf("The average of %d ,%d ,%d is %f",num1,num2,num3,avg);
		 sc.close();
	}
	
}
