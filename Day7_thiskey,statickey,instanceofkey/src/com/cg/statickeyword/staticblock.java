package com.cg.statickeyword;

public class staticblock {
	static int num;
	static String str;
	//to initialize value without constructor and obj creation static block is used
	//make variables of class static
	static
	{
		num=12;
		str= "perseverance";
	}
	/*//constructor
	staticBlock()
	{
		num=15;
		str="perseverance";
	}*/
		public static void main(String[] args) {
			staticblock s=new staticblock();
			//System.out.println(s.num);
			//System.out.println(s.str);
			System.out.println(num);
			System.out.println(str);
			

		}

}
