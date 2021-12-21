package com.Kirti.cj.Exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


public class CheckedExceptionExample {

	public static void main(String args[])  {
		
		//File file=new File("data/name.txt");
		try(BufferedReader br=new BufferedReader(new FileReader(new File("data/name.txt")))){
		
		//try{
		//	FileReader fr=new FileReader(file);
		//	 br=new BufferedReader(fr);
		String str=null;
			while((str= br.readLine()) != null) {
			System.out.println(str);
			}
		//}
		//catch(FileNotFoundException e) {
		//	e.printStackTrace();
		}
			catch(IOException e) {
				e.printStackTrace();
		}
		//finally {
			//if(br!=null) {
				//try {
					//br.close();
				//} catch (IOException e) {
				//	System.out.println("while closing resource:"+e);
					
				}
			
		
	}

