package com.cg.makingdecision;

import java.util.Scanner;

// nested if
public class NestedifStatement {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int age= s.nextInt();
		int weight= s.nextInt();
		
		if (age>=15)
		{
			if (weight>=60)
			{
				if (weight <=150)
				{
					System.out.println ("Allowed for trecking");
				}
				else
				{
					System.out.println ("It is little bit risky");
				}
				
			}
			else
			{
				System.out.println("Not allowed for trecking");
			}
			
		}
		

	}

}
