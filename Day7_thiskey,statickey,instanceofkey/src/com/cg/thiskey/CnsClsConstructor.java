package com.cg.thiskey;
//5 this to invoke cnt cls constructor
class music
{
	String tune;
	//default/non parameterised constructor
	music()
	{
		this ("melodious");
		System.out.println("striving to listen");
		
	}
	//parameterise constructor
	music(String tune)
	{
		this.tune=tune;
		System.out.println("sufi music");
		
	}
}

public class CnsClsConstructor {

	public static void main(String[] args) {
		music m=new music();
		

	}

}
