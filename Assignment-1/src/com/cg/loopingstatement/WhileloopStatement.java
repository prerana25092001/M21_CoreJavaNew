package com.cg.loopingstatement;
// while loop
import java.util.Scanner;

public class WhileloopStatement {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n= s.nextInt();
		while (n<=10)
		{
			System.out.println(n);
			n++;
		}

	}

}
