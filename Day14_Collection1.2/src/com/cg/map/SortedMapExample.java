package com.cg.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<String,String>s=new TreeMap<String,String>();
		s.put("prerana", "kokil");
		s.put("pallavi", "patil");
		s.put("geeta", "thakur");
		//s.put("prerana", "kokil");
		//sorted map doesn't print duplicated elements
		s.put("sid", null);
		System.out.println(s);
		//will print elements in alphabetical order
		//to print elements separately
		for(SortedMap.Entry m:s.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
