package com.cg.lamex;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLamEx {

	public static void main(String[] args) {
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\prerana\\Desktop");
		File[] contents=dir.listFiles(obj);
		for (File i:contents)
		{
			System.out.println(i);
		}

	}

}
