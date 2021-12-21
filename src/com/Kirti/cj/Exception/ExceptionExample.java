package com.Kirti.cj.Exception;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Start of main method");
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of num1:");
   int num1=sc.nextInt();
   System.out.println("Enter the value of num2:");
   int num2=sc.nextInt();
   try {
   int res= divide(num1, num2);
   System.out.println(String.format("%s  %s  %s = %s" , num1, "%" , num2, res));
   }
   catch(ArithmeticException e) {
	   e.printStackTrace();
  }catch(NumberFormatException e) {
	   e.printStackTrace();
   }
	catch(Exception e) {
	   System.err.println("Value of num2 can't be 0");
	   e.printStackTrace();
   }
   finally {
	   System.out.println("closing resources");
   
   
   sc.close();
   }

   System.out.println("End of main method");
	}
private static int divide(int num1,int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
}
	   
	   	


