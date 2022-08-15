package com.cg.operators;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		
        int x= ++a;
        int y= ++b;
        int z = a+y;
        System.out.println(z);

	}

}
