package com.cg.map;
//navigable map
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<Object,Object> n=new TreeMap<Object,Object>();
		n.put(88, "prerana");
		n.put(88, "prerana");
		n.put(11, "pratiksha");
		n.put(21, "geeta");
		//will print elements sequentially
		System.out.println(n);
		System.out.println(n.firstEntry());
		System.out.println(n.lastEntry());
		

	}

}
