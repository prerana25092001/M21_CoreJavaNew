package com.cg.userinput;

import java.util.Scanner;

public class StringIn {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String a= s.next();
		String a1= s.nextLine();
		//nextLine()= method to return entire string 
		// if i/p= Prerana kokil, without this o/p ='Prerana' and with it o/p= 'Prerana kokil' 
		System.out.println(a);
		
	}

}
