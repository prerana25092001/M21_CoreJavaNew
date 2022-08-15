package com.cg.makingdecision;

import java.util.Scanner;

public class SwitchcaseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String a= s.next();
		switch(a)
		{
		case "bcd":
		System.out.println("Prerana");
		break;
		case "def":
			System.out.println("Pratiksha");
			break;
		case "ghi":
			System.out.println("Prathamesh");
			break;
			default:
				System.out.println("Rahul");
		}
		

	}

}
