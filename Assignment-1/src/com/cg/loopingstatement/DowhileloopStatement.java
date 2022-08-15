package com.cg.loopingstatement;

import java.util.Scanner;

public class DowhileloopStatement {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		do
		{
			System.out.println("" +(a/=b));
		}while (a>0 && b>0);


	}

}
