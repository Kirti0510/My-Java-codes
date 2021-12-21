package com.careerit.cj.demo;

import java.util.Scanner;

public class EvenOddProgram {
	
	public static void main(String[]args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of num:");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num +"is Even");
		}
			else {
				System.out.println(num +"is odd");
			}
			sc.close();
			}
		}
		

		
	


