package com.Kirti.corejava.conditional;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num_1=sc.nextInt();
		System.out.println("Enter the num2: ");
		int num_2=sc.nextInt();
		System.out.println("Enter the num3: ");
		int num_3=sc.nextInt();
		int big;
	if(num_1>num_2 && num_2>num_3){
		big=num_1;}
		else if(num_2>num_3) {
			big=num_2;
		}
		else {
			big=num_3;
		}
	System.out.printf("Biggest of (%d, %d, %d)= %d",num_1,num_2,num_3,big);
	sc.close();
	
	}
}
		
		//if(num_1>num_2) {
		//	System.out.println("Biggest is:"+num_1);
		//}
		//	else {
			//	System.out.println("Biggest is:"+num_2);
			//}
			

		
		
		

	

