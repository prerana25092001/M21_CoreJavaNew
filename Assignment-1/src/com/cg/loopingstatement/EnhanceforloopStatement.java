package com.cg.loopingstatement;
// enhance for loop
import java.util.Scanner;

// enhance for loop
public class EnhanceforloopStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int  n =  s.nextInt();
		int arr[]=new int[n];
		//to enter the array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		//to print the array elements
		for(int i:arr)
		{
			System.out.println(i);
			
		}
		

	}

}
