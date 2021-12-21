package com.Kirti.corejava.conditional;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score(1-10) only");
		int score=sc.nextInt();
		String grade="Wrong input score can't be < 0 & >10";
		if(score >=8 && score <=10) {
			grade="A";
			}
		else if(score >=5 && score <=7) {
			grade="B";
			}
		else if(score >=1 && score<=4) {
			grade="c";
			}
			
			System.out.println("student score:" + score + "and grade is:" + grade);
			
		sc.close();
		}
}
	

